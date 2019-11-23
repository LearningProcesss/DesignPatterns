package command_pattern.command.concrete;

import command_pattern.command.ICommand;
import command_pattern.receiver.Light;

/**
 * LightOffCommand
 */
public class LightOffCommand implements ICommand {

    Light receiver;

    public LightOffCommand(Light light) {
        this.receiver = light;
    }

    @Override
    public void execute() {
        this.receiver.off();
    }

    @Override
    public void undo() {
        this.receiver.on();

    }

}