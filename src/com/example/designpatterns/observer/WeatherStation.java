package com.example.designpatterns.observer;

import com.example.designpatterns.observer.Observer;

public interface WeatherStation {

    String registerObserver(Observer observer);

    String removeObserver(Observer observer);

    void notifyObservers();
}
