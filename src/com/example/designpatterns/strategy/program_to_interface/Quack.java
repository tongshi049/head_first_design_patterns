package com.example.designpatterns.strategy.program_to_interface;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("This duck can quack.");
    }
}
