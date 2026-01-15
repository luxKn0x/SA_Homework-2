@Slf4j
@AllArgsConstructor
public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;

    @Override
    public void pay(double amount) {
        log.info("Paid {} using Credit Card {}", amount, cardNumber);
    }
}
