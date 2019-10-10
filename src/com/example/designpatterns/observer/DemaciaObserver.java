package com.example.designpatterns.observer;


public class DemaciaObserver implements Observer, Display {

    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherStation weatherStation;

    public DemaciaObserver(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temp, float humi, float pres) {
        this.temperature = temp;
        this.humidity = humi;
        this.pressure = pres;
        displayWeatherData();
    }

    @Override
    public void displayWeatherData() {
        System.out.println("Current weather in Demacia is:");
        System.out.println("Temperature: " + this.temperature + " ; " +
                "Humidity: " + this.humidity + " ; " +
                "Pressure: " + this.pressure);
    }
}
