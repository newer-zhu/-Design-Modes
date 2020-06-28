package facade;

public class Screen {
    private Screen(){}

    private static Screen screen = new Screen();

    public static Screen getInstance(){
        return screen;
    }

    public void on(){
        System.out.println("screen is on");
    }

    public void off(){
        System.out.println("screen is off");
    }
}
