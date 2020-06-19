package adapter.InterfaceAdapter;

public class Client {
    public static void main(String[] args) {
        AbstractExp abstractExp = new AbstractExp() {
            @Override
            public void method1() {
                System.out.println("use method1");
            }
        };

        abstractExp.method1();
    }
}
