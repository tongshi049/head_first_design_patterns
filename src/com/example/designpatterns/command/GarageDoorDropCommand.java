package com.example.designpatterns.command;

public class GarageDoorDropCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDropCommand (GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
