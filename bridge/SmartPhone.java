package bridge;

import java.util.Optional;

public class SmartPhone extends Phone {
    public SmartPhone(Brand brand) {
        super(brand);
    }

    void call(){
        super.call();
        System.out.println("智能机打电话");
    }

    void close(){
        super.close();
        System.out.println("智能机关机");
    }
}
