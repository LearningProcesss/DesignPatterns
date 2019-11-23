package command_pattern.client;

import command_pattern.command.concrete.GarageDoorOpenCommand;
import command_pattern.command.concrete.LightOffCommand;
import command_pattern.command.concrete.LightOnCommand;
import command_pattern.invoker.RemoteControl;
import command_pattern.invoker.RemoteControlWithUndo;
import command_pattern.invoker.SimpleRemoteControl;
import command_pattern.receiver.GarageDoor;
import command_pattern.receiver.Light;
import command_pattern.receiver.Stereo;

/**
 * RemoteControleTest
 */
public class RemoteControlTest {

    public static void test() {

        SimpleRemoteControl invoker = new SimpleRemoteControl();

        Light light = new Light();

        LightOnCommand command = new LightOnCommand(light);

        invoker.setCommand(command);

        invoker.buttonWasPressed();

        GarageDoor gDoor = new GarageDoor();

        GarageDoorOpenCommand gCommand = new GarageDoorOpenCommand(gDoor);

        invoker.setCommand(gCommand);

        invoker.buttonWasPressed();
    }

    public static void test2() {

        RemoteControl invoker = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lOn = new LightOnCommand(light);
        LightOffCommand lOff = new LightOffCommand(light);
        GarageDoorOpenCommand gOn = new GarageDoorOpenCommand(garageDoor);
        
        invoker.setCommand(0, lOn, lOff);

        invoker.onButtonWasPushed(0);
    }

    public static void testUndo() {
        RemoteControlWithUndo invoker = new RemoteControlWithUndo();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        LightOnCommand lOn = new LightOnCommand(light);
        LightOffCommand lOff = new LightOffCommand(light);
        GarageDoorOpenCommand gOn = new GarageDoorOpenCommand(garageDoor);
        
        invoker.setCommand(0, lOn, lOff);

        invoker.onButtonWasPushed(0);
        invoker.undoButtonWasPushed();
    }
}
