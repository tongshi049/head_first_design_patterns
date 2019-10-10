package com.example.designpatterns.mvc.duck_simulator;

public class RubberDuck implements Quackable {

    Observable observable;

    public RubberDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        notifyObservers(); // when duck quacks,
        // we need to let the observers know about it
    }


    @Override
    public void registerObserver(Observer observer) {
        this.observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        this.observable.notifyObservers();
    }
}
