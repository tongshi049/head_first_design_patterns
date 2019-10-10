package com.example.designpatterns.command;

/*
* client: hold the command, receiver, and invoker objects
* */
public class RemoteLoader {

    public static void main(String[] args) {

        // Create all the devices
        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();

        // Create all the light command objects
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Create all the garage door command objects
        Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        Command garageDoorDropCommand = new GarageDoorDropCommand(garageDoor);

        // load commands to the remote slots
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommands(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommands(1, garageDoorOpenCommand, garageDoorDropCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

    }
}
