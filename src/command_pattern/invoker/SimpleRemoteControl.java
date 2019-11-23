package command_pattern.invoker;

import command_pattern.command.ICommand;

/**
 * SimpleRemoteControl
 */
public class SimpleRemoteControl {

    ICommand slot;

    public SimpleRemoteControl() {

    }

    public void setCommand(ICommand command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}