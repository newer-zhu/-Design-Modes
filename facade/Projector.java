package facade;

import java.lang.reflect.Proxy;

public class Projector {
    private static Projector projector = new Projector();

    public static Projector getInstance(){
        return projector;
    }

    private Projector(){}

    public void on(){
        System.out.println("projector is on");
    }

    public void off(){
        System.out.println("projector is off");
    }
}
