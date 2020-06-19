package singleton;

public class Singleton02 {
    private static Singleton02 instance;

    private Singleton02(){

    }

    static {
        instance = new Singleton02();
    }

    public static Singleton02 getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance2 = Singleton02.getInstance();
        System.out.println(instance == instance2);
    }

}
