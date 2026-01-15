@Slf4j
public class SmsNotification implements OrderObserver {

    @Override
    public void update(Order order) {
        log.info("SMS notification for order {}", order.getId());
    }
}
