package com.example.designpatterns.strategy.program_to_interface;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    void display() {
        System.out.println("I'm a model duck.");
    }
}
