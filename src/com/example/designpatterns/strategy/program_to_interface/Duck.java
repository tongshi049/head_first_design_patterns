package com.example.designpatterns.strategy.program_to_interface;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void swim() {
        System.out.println("Duck can swim.");
    }

    void display() {
        System.out.println("This duck looks like ... ");
    }

    void performFly() {
        this.flyBehavior.fly();
    }

    void performQuack() {
        this.quackBehavior.quack();
    }

    void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

}
