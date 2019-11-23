package command_pattern.command.concrete;

import command_pattern.command.ICommand;
import command_pattern.receiver.Stereo;

/**
 * StereoOnWithCdCommand
 */
public class StereoOnWithCdCommand implements ICommand {

    private Stereo receiver;

    public StereoOnWithCdCommand(Stereo stereo) {
        this.receiver = stereo;
    }

    @Override
    public void execute() {
        this.receiver.on();
        this.receiver.setCD();
        this.receiver.setVolume(11);
    }

    @Override
    public void undo() {
        this.receiver.off();
    }
}