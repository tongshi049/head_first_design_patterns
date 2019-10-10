package com.example.designpatterns.adapter.facade;

public class Projector {

    DvdPlayer dvdPlayer;

    public Projector(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println("Turn on projector ... ");
    }

    public void off() {
        System.out.println("Turn off projector ... ");
    }

    public void tvMode() {

    }

    public void wideScreenMode() {
        System.out.println("Turn on projector wide screen mode ... ");
    }
}
