# Command Pattern

Allows you to decouple the requester of an action from the object that actually performs the action.  

**Command interface**:

Command interface consists in only one method.  
All commands will implements this interface.  

```java
public interface ICommand {

    public void execute();
}
```

**Concrete commands implementation**:

```java
public class LightOnCommand implements ICommand {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.on();
    }
}
```

**Invokers**:

```java
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
```

**Client**:

```java
public class RemoteControleTest {

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
}
```

## Command Pattern definition

Encapsulates a request as an object, thereby letting you parameterize other objects wih different requests, queue or log requests, and support undoable operations.  

## Class diagram

![](/out/ulm/command_pattern_defined/Command_Pattern_defined.png)

## Implementing Remote Control with Command Pattern

