package com.example.designpatterns.strategy.program_to_interface;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck cannot fly.");
    }
}
