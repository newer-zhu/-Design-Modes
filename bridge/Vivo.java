package bridge;

public class Vivo implements Brand {
    @Override
    public void call() {
        System.out.println("Vivo打电话");
    }

    @Override
    public void close() {
        System.out.println("Vivo关机");
    }
}
