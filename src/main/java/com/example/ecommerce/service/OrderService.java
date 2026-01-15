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
