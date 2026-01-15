@Slf4j
public abstract class OrderValidationHandler {

    protected OrderValidationHandler next;

    public void setNext(OrderValidationHandler next) {
        this.next = next;
    }

    public abstract void validate(Order order);
}
