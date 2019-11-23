package command_pattern.command.concrete;

import command_pattern.command.ICommand;

/**
 * NoCommand
 */
public class NoCommand implements ICommand {

    @Override
    public void execute() {

    }

    @Override
    public void undo() {
        // TODO Auto-generated method stub

    }
}