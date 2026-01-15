package behavioral.chain;

public class AuthenticationHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.contains("auth")) {
            System.out.println("✔ Authentication passed");
            if (next != null) next.handle(request);
        } else {
            System.out.println("❌ Authentication failed");
        }
    }
}
