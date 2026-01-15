@Slf4j
public class InventoryCheckHandler extends OrderValidationHandler {

    @Override
    public void validate(Order order) {
        log.info("Inventory check");

        if (order.getQuantity() <= 0) {
            throw new RuntimeException("Invalid quantity");
        }

        if (next != null) next.validate(order);
    }
}
