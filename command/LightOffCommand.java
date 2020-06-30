package command;

public class LightOffCommand implements Command{
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver receiver){
        this.lightReceiver = receiver;
    }

    @Override
    public void execute() {
        lightReceiver.off();
    }

    @Override
    public void undo() {
        lightReceiver.on();
    }
}
