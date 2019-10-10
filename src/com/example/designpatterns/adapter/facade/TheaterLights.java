package com.example.designpatterns.adapter.facade;

public class TheaterLights {
    public void on() {
        System.out.println("Turn on theater lights...");
    }

    public void off() {
        System.out.println("Turn down theater lights...");
    }

    public void dim() {
        System.out.println("Dim light mode...");
    }
}
