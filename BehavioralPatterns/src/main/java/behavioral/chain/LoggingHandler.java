package behavioral.chain;

public class LoggingHandler extends Handler {
    @Override
    public void handle(String request) {
        System.out.println("📝 Logging request: " + request);
    }
}
