@Slf4j
public class PaymentValidationHandler extends OrderValidationHandler {

    @Override
    public void validate(Order order) {
        log.info("Payment validation");

        if (order.getAmount() <= 0) {
            throw new RuntimeException("Invalid payment amount");
        }

        if (next != null) next.validate(order);
    }
}
