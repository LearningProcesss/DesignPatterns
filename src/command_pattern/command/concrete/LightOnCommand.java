package command_pattern.command.concrete;

import command_pattern.command.ICommand;
import command_pattern.receiver.Light;

/**
 * LightOnCommand
 */
public class LightOnCommand implements ICommand {

    Light receiver;

    public LightOnCommand(Light light) {
        this.receiver = light;
    }

    @Override
    public void execute() {
        this.receiver.on();
    }

    @Override
    public void undo() {
        this.receiver.off();
    }
}