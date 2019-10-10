package com.example.designpatterns.command;

public class RemoteControlTest {


    public static void main(String[] args) {

        // create a remote control
        // Invoker, will be passed a command object that can be
        // used to make request.
        SimpleRemoteControl spc = new SimpleRemoteControl();

        // create a light
        // Receiver of the request
        Light light = new Light();

        // create a light on command
        Command command = new LightOnCommand(light);

        // pass the command to invoker
        spc.setCommand(command);
        spc.buttonWasPressed();

        GarageDoor garageDoor = new GarageDoor();
        Command command2 = new GarageDoorOpenCommand(garageDoor);

        spc.setCommand(command2);
        spc.buttonWasPressed();

    }
}
