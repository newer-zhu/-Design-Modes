package command;

/**
 * spring JdbcTemplate源码用过
 */
public class Client {
    public static void main(String[] args) {
        LightReceiver lightReceiver = new LightReceiver();

        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);

        Controller controller = new Controller();

        controller.setCommand(0,lightOnCommand,lightOffCommand);

        controller.onButton(0);
    }
}
