package com.example.ecommerce.service.chain;

import com.example.ecommerce.model.Order;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class OrderValidationHandler {

    protected OrderValidationHandler next;

    public void setNext(OrderValidationHandler next) {
        this.next = next;
    }

    public abstract void validate(Order order);
}
