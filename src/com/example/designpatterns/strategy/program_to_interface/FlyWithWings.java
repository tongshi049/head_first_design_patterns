package com.example.designpatterns.strategy.program_to_interface;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("This duck can fly with wings.");
    }
}
