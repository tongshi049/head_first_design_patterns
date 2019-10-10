package com.example.designpatterns.adapter.facade;

public class PopcornPopper {
    public void on(){
        System.out.println("Turn popcorn poper on ...");
    }

    public void pop() {
        System.out.println("Start popping popcorn...");
    }

    public void down() {
        System.out.println("Popcorn popper stops working...");

    }
}
