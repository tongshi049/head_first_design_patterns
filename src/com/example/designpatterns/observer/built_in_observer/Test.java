package com.example.designpatterns.observer.built_in_observer;

import java.util.Observable;
import java.util.Observer;

public class Test {

    public static void main(String[] args) {
        Observable weatherData = new WeatherData();

        Observer observer = new CurrentConditionsDisplay(weatherData);

        ((WeatherData) weatherData).setMeasurements(80.0, 80.0, 80.0);

        ((WeatherData) weatherData).setMeasurements(85.0, 60.0, 80.0);
    }
}
