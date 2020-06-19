package bridge;

public class DumbPhone extends Phone {
    public DumbPhone(Brand brand) {
        super(brand);
    }

    void call(){
        super.call();
        System.out.println("智障机打电话");
    }

    void close(){
        super.close();
        System.out.println("智障机关机");
    }
}
