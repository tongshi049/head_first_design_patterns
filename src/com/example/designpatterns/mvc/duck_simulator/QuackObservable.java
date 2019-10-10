package com.example.designpatterns.mvc.duck_simulator;

public interface QuackObservable {

    public void registerObserver(Observer observer);

    public void notifyObservers();

}
