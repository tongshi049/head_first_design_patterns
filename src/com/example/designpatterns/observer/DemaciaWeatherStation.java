package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class DemaciaWeatherStation implements WeatherStation{

    // some states reflecting the weather in demacia
    private float temperature;
    private float humidity;
    private float pressure;

    // observers
    private List<Observer> observers;

    /*
    * constructor
    * */
    public DemaciaWeatherStation() {
        this.observers = new ArrayList<>();
    }


    /*
    * set weather data
    * */
    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged () {
        notifyObservers();
    }


    @Override
    public String registerObserver(Observer observer) {
        if (observer instanceof DemaciaObserver) {

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

        if (observer instanceof DemaciaObserver) {
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
            DemaciaObserver demaciaObserver = (DemaciaObserver) observer;
            demaciaObserver.update(this.temperature, this.humidity, this.pressure);
        }
    }
}
