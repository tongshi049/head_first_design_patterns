package com.example.designpatterns.strategy.program_to_interface;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("RedheadDuck has red head.");
    }
}
