package com.example.designpatterns.observer;

public class IoniaObserver implements Observer, Display {

    private float temperature;
    private float humididy;
    private float wind;
    private float visibility;

    @Override
    public void update(float temp, float wind, float visibility) {
        this.temperature = temp;
        this.wind = wind;
        this.visibility = visibility;
    }

    @Override
    public void displayWeatherData() {
        System.out.println("Current weather in Ionia is:");
        System.out.println("Temperature: " + this.temperature + " ; " +
                "Wind: " + this.wind + " ; " +
                "Visibility: " + this.visibility);
    }

}
