package behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {

        Store store = new Store();

        store.subscribe(new Customer("Alice"));
        store.subscribe(new Customer("Bob"));

        store.notifyCustomers("New product launched!");
    }
}
