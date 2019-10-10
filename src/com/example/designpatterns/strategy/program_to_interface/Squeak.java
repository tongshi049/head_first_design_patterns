package com.example.designpatterns.strategy.program_to_interface;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("This duck can squeak.");
    }
}
