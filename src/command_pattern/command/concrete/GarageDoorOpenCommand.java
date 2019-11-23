package command_pattern.command.concrete;

import command_pattern.command.ICommand;
import command_pattern.receiver.GarageDoor;

/**
 * GarageDoorOpenCommand
 */
public class GarageDoorOpenCommand implements ICommand {

    GarageDoor receiver;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.receiver = garageDoor;
    }

    @Override
    public void execute() {
        this.receiver.open();
    }

    @Override
    public void undo() {
        this.receiver.close();

    }
}