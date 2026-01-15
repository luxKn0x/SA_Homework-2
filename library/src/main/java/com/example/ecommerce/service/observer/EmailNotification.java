@Slf4j
public class EmailNotification implements OrderObserver {

    @Override
    public void update(Order order) {
        log.info("Email notification for order {}", order.getId());
    }
}
