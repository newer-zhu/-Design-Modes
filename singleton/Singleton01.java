package singleton;

/**
 * JDK的Runtime用到了单例模式
 */
public class Singleton01 {
    private static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01(){

    }

    public static Singleton01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {

    }
}
