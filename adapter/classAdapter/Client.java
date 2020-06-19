package adapter.classAdapter;

public class Client {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.charging(new Adapter());
    }
}
