package facade;

public class DVDPlayer {
    private static DVDPlayer dvdPlayer = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return dvdPlayer;
    }

    private DVDPlayer(){}

    public void On(){
        System.out.println("DVD is on");
    }

    public void off(){
        System.out.println("DVD is off");
    }

    public void play(){
        System.out.println("DVD is playing");
    }

    public void pause(){
        System.out.println("DVD is pausing");
    }
}
