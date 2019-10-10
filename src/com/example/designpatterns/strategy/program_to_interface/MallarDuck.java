package com.example.designpatterns.strategy.program_to_interface;

public class MallarDuck extends Duck {

    public MallarDuck() {
        quackBehavior = new Quack(); // here we program to implementation, which is not good!!!
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
