package command_pattern.invoker;

import command_pattern.command.ICommand;
import command_pattern.command.concrete.NoCommand;

/**
 * RemoteControlWithUndo
 */
public class RemoteControlWithUndo {
    private ICommand[] onCommand;
    private ICommand[] offCommand;
    private ICommand undoCommand;

    public RemoteControlWithUndo() {
        this.onCommand = new ICommand[7];
        this.offCommand = new ICommand[7];

        ICommand noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            this.onCommand[i] = noCommand;
            this.offCommand[i] = noCommand;
        }

        this.undoCommand = noCommand;
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommand[slot].execute();
        undoCommand = this.onCommand[slot];
    }

    public void offButtonWasPushed(int slot) {
        this.offCommand[slot].execute();
        undoCommand = this.offCommand[slot];
    }

    public void undoButtonWasPushed() {
        this.undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n------- Remote Control -------\n");
        for (int i = 0; i < 7; i++) {
            buffer.append(String.format("[slot %s]\non->%s\noff->%s\n", i, this.onCommand[i].getClass().getName(),
                    this.offCommand[i].getClass().getName()));
        }
        return buffer.toString();
    }

}