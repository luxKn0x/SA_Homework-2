@Service
public class NotificationService {

    private final List<OrderObserver> observers = new ArrayList<>();

    public NotificationService() {
        observers.add(new EmailNotification());
        observers.add(new SmsNotification());
    }

    public void notifyAll(Order order) {
        observers.forEach(o -> o.update(order));
    }
}
