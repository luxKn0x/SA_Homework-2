package behavioral.chain;

public class ChainDemo {
    public static void main(String[] args) {
        Handler auth = new AuthenticationHandler();
        Handler authorization = new AuthorizationHandler();
        Handler logging = new LoggingHandler();

        auth.setNext(authorization);
        authorization.setNext(logging);

        auth.handle("auth admin request");
    }
}
