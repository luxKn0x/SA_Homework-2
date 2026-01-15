@Slf4j
@AllArgsConstructor
public class PlaceOrderCommand implements OrderCommand {

    private Order order;
    private OrderRepository repository;
    private NotificationService notificationService;

    @Override
    public void execute() {
        order.setStatus("PLACED");
        repository.save(order);
        notificationService.notifyAll(order);
        log.info("Order placed");
    }
}
