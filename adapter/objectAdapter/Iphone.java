package adapter.objectAdapter;

public class Iphone {
    public void charging(Adapter a){
        if (a.output5v() == 5){
            System.out.println("正在充电");
        }else {
            System.out.println("充电失败");
        }
    }
}
