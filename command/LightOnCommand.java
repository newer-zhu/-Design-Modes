package command;

public class LightOnCommand implements Command {
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver receiver){
        this.lightReceiver = receiver;
    }

    @Override
    public void execute() {
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }
}
