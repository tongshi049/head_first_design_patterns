package com.example.designpatterns.mvc.duck_simulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Composite pattern:
* needs to implement the same interface as the leaf elements
*
* safety vs. transparent
* */
public class Flock implements Quackable {

    Observable observable;

    List quackers = new ArrayList();

    public void add(Quackable quacker) {
        this.quackers.add(quacker);
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
            notifyObservers();
        }
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
