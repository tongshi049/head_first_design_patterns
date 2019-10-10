package com.example.designpatterns.adapter.facade;

public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;



    public void on() {
        System.out.println("Turn on amplifier ... ");
    }

    public void off() {
        System.out.println("Turn off amplifier ... ");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Set DVD player ... ");
    }

    public void setSurroundSound() {
        System.out.println("Set surround sound ... ");
    }

    public void setTuner() {

    }

    public void setVolume(int number) {
        System.out.println("Set volume to " + number);
    }
}
