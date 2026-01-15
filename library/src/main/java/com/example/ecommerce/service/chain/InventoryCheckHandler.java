package com.example.ecommerce.service.chain;

import com.example.ecommerce.model.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InventoryCheckHandler extends OrderValidationHandler {

    @Override
    public void validate(Order order) {
        Process log;
        log.info("Inventory check");

        if (order.getQuantity() <= 0) {
            throw new RuntimeException("Invalid quantity");
        }

        if (next != null) next.validate(order);
    }
}
