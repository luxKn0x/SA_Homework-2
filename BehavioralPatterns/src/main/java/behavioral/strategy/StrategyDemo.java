package behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {

        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment("1234-5678-9999"));
        context.checkout(200.0);

        context.setStrategy(new PayPalPayment("user@example.com"));
        context.checkout(150.0);
    }
}
