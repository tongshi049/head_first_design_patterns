package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import com.example.designpatterns.observer.Observer;

public class IoniaWeatherStation implements WeatherStation {

    // some states reflecting the weather in Ionia
    private float temperature;
    private float wind;
    private float visibility;

    // observers
    private List<Observer> observers;

    /*
     * constructor
     * */
    public IoniaWeatherStation() {
        this.observers = new ArrayList<>();
    }


    /*
     * set weather data
     * */
    public void setWeatherData(float temperature, float wind, float visibility) {
        this.temperature = temperature;
        this.wind = wind;
        this.visibility = visibility;
    }


    @Override
    public String registerObserver(Observer observer) {
        if (observer instanceof IoniaObserver) {

            if (this.observers.contains(observer))
                throw new RuntimeException("This observer has already been registered.");

            this.observers.add(observer);
            return "Success!";

        } else {

            throw new RuntimeException("You have registered a wrong channel.");

        }

    }

    @Override
    public String removeObserver(Observer observer) {

        if (observer instanceof IoniaObserver) {

            if (!this.observers.contains(observer))
                throw new RuntimeException("This observer does not exist");

            this.observers.remove(observer);
            return "Success!";

        } else {

            throw new RuntimeException("Unexpected observer type.");

        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: this.observers) {
            IoniaObserver ioniaObserver = (IoniaObserver) observer;
            ioniaObserver.update(this.temperature, this.wind, this.visibility);
        }
    }
}
