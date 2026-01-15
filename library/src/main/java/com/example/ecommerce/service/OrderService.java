package com.example.ecommerce.service;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final OrderRepository repository;
    private final NotificationService notificationService;

    public Order placeOrder(Order order) {

        // Chain of Responsibility
        OrderValidationHandler inventory = new InventoryCheckHandler();
        OrderValidationHandler payment = new PaymentValidationHandler();
        inventory.setNext(payment);
        inventory.validate(order);

        // Strategy
        PaymentStrategy strategy =
                order.getPaymentMethod().equals("CARD")
                        ? new CreditCardPayment("1234-5678")
                        : new PaypalPayment("user@mail.com");

        strategy.pay(order.getAmount());

        // Command
        OrderCommand command =
                new PlaceOrderCommand(order, repository, notificationService);
        command.execute();

        return order;
    }
}
