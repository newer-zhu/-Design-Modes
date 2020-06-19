package adapter.objectAdapter;

public class Client {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.charging(new Adapter(new PowerSource()));
    }
}
