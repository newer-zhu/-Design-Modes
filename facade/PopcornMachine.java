package facade;

public class PopcornMachine {
    private static PopcornMachine popcornMachine = new PopcornMachine();

    public static PopcornMachine getInstance(){
        return popcornMachine;
    }

    private PopcornMachine(){}

    public void makePopcorn(){
        System.out.println("making popcorn");
    }

    public void stop(){
        System.out.println("stop making popcorn");
    }

}
