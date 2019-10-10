package com.example.designpatterns.mvc.duck_simulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
* Observable implements all the functionality
* a Quackable needs to be an observable.
*
* We just need to plug it into a class and have that class
* delegate to the Observable.
*
* */
public class Observable implements QuackObservable {

    List observers = new ArrayList();

    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
