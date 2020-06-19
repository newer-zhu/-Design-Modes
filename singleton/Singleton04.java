package singleton;

public class Singleton04 {
    private static Singleton04 instance;

    private Singleton04(){};

    /**
     * 懒加载，线程安全。效率太低
     * @return
     */
    public static synchronized Singleton04 getInstance(){
        if (instance == null)
            instance = new Singleton04();
        return instance;
    }
}
