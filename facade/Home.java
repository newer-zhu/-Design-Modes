package facade;


/**
 * mybatis中configuration创建metaObject
 * 通过合理使用可以划分访问的层次
 */
public class Home {
    private Projector projector;
    private PopcornMachine popcornMachine;
    private DVDPlayer dvdPlayer;
    private Screen screen;

    public Home(Projector projector, PopcornMachine popcornMachine, DVDPlayer dvdPlayer, Screen screen) {
        this.projector = Projector.getInstance();
        this.popcornMachine = PopcornMachine.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
        this.screen = Screen.getInstance();
    }

    public void ready(){
        screen.on();
        dvdPlayer.On();
        popcornMachine.makePopcorn();
        projector.on();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        projector.off();
        screen.off();
        popcornMachine.stop();
        dvdPlayer.off();
    }
}
