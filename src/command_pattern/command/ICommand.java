package command_pattern.command;

/**
 * ICommand
 */
public interface ICommand {
    public void execute();
    public void undo();
}