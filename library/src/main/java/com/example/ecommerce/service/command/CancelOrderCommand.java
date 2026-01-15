@Slf4j
@AllArgsConstructor
public class CancelOrderCommand implements OrderCommand {

    private Order order;
    private OrderRepository repository;
    private NotificationService notificationService;

    @Override
    public void execute() {
        order.setStatus("CANCELLED");
        repository.save(order);
        notificationService.notifyAll(order);
        log.info("Order cancelled");
    }
}
