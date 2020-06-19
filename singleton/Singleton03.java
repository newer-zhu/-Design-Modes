package singleton;

public class Singleton03 {
    private static Singleton03 instance;

    private Singleton03(){};

    /**
     * 懒加载，线程不安全。两个线程都遇见if语句可能会创建两个实例对象
     * @return
     */
    public static Singleton03 getInstance(){
        if (instance == null)
            instance = new Singleton03();
        return instance;
    }

    public static void main(String[] args) {
        Singleton03 instance = Singleton03.getInstance();
        Singleton03 instance1 = Singleton03.getInstance();
        System.out.println(instance == instance1);
    }
}
