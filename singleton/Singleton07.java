package singleton;


/**
 * 避免了线程问题，还能防止反序列化重新创建对象，推荐
 */
enum Singleton{
    INSTANCE;
    public void print(){
        System.out.println("ok");
    }

}


public class Singleton07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;

    }
}
