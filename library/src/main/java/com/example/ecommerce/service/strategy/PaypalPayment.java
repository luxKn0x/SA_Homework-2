@Slf4j
@AllArgsConstructor
public class PaypalPayment implements PaymentStrategy {

    private String email;

    @Override
    public void pay(double amount) {
        log.info("Paid {} using PayPal {}", amount, email);
    }
}
