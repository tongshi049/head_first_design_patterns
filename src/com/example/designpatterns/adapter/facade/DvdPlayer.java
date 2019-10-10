package com.example.designpatterns.adapter.facade;

public class DvdPlayer {

    Amplifier amplifier;


    public void on() {
        System.out.println("Start the DVD player ... ");
    }

    public void off() {
        System.out.println("Turn off the DVD player ... ");
    }

    public void eject() {
        System.out.println("Start ejecting ... ");
    }

    public void pause() {
        System.out.println("Pause the video ");
    }

    public void play(String movie) {
        System.out.println("Play the movie: " + movie);
    }

    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

    public void stop() {
        System.out.println("Stop the video ");
    }
}
