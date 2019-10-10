package com.example.designpatterns.command;

public class SimpleRemoteControl {

    // slot to hold our command
    Command slot;

    public SimpleRemoteControl() {
    }

    /*
    * Set the command the slot is going to control
    * This may be called multiple times if the client
    * wants to change the behavior of the remote button
    * */
    public void setCommand(Command command) {
        this.slot = command;
    }

    /*
    *
    * */
    public void buttonWasPressed() {
        slot.execute();
    }
}
