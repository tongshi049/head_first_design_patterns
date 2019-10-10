package com.example.designpatterns.mvc.duck_simulator;

public class MallardDuck implements Quackable {

    Observable observable;

    /*
    * In the constructor, we create an Observable and pass it a
    * reference to the MallardDuck object
    *
    * */
    public MallardDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
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
