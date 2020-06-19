package singleton;

public class Singleton05 {
    private static volatile Singleton05 instance;

    private Singleton05(){};

    /**
     * 双重锁，volatile可以通知其他线程instance的实时情况，防止指令重排
     * @return
     */
    public static Singleton05 getInstance(){
        if (instance == null) {
            synchronized (Singleton05.class) {
                if (instance == null) {
                    instance = new Singleton05();
                }
            }
        }
        return instance;
    }
}
