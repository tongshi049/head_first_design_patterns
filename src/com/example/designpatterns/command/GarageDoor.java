package com.example.designpatterns.command;

public class GarageDoor {
    public void up() {
        System.out.println("Turn up the garage door");
    }

    public void down() {
        System.out.println("Turn down the garage door");
    }

    public void stop() {
        System.out.println("Stop turning the garage door");
    }

    public void lightOn() {
        System.out.println("Turn on the garage light");
    }

    public void lightOff() {
        System.out.println("Turn off the garage light");
    }


}
