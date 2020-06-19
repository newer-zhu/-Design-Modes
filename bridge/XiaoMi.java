package bridge;

public class XiaoMi implements Brand {
    @Override
    public void call() {
        System.out.println("小米打电话");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }
}
