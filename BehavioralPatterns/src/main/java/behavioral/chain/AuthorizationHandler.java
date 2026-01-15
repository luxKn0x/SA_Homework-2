package behavioral.chain;

public class AuthorizationHandler extends Handler {
    @Override
    public void handle(String request) {
        if (request.contains("admin")) {
            System.out.println("✔ Authorization passed");
            if (next != null) next.handle(request);
        } else {
            System.out.println("❌ Authorization failed");
        }
    }
}
