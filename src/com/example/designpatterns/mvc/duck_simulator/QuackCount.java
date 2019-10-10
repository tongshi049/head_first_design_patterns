package com.example.designpatterns.mvc.duck_simulator;

/*
* A decorator
* */
public class QuackCount implements Quackable {

    Quackable duck;

    Observable observable;

    static int numberOfQuacks;

    public QuackCount(Quackable duck) {
        this.duck = duck;
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getQuacks() {
        return numberOfQuacks;
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
