package com.example.designpatterns.mvc.duck_simulator;

public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck.getClass().getName() + " just quacked.");
    }
}
