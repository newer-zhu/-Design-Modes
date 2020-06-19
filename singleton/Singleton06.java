package singleton;

public class Singleton06 {
    private Singleton06(){};

    /**
     * 静态内部类,线程安全，调用getInstance方法才会加载
     */
    private static class SingletonInstance{
        private static final Singleton06 INSTANCE = new Singleton06();
    }

    public static Singleton06 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
