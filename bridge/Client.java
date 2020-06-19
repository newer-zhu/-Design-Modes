package bridge;


/**
 * Jdbc的Driver接口用过
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new SmartPhone(new XiaoMi());
        phone.call();
        phone.close();
    }
}
