package com.example.designpatterns.observer;

public class TestObserver {

    public static void main(String[] args) {

        WeatherStation dWeatherStation = new DemaciaWeatherStation();

        DemaciaObserver Garen = new DemaciaObserver(dWeatherStation);
        DemaciaObserver Lux = new DemaciaObserver(dWeatherStation);

        ((DemaciaWeatherStation) dWeatherStation).setWeatherData(35, 2, 1);

        ((DemaciaWeatherStation) dWeatherStation).setWeatherData(40, 5, 1);


//        System.out.println("=====Garen subscribed=====");
//        dWeatherStation.registerObserver(Garen);
//        System.out.println("=====Lux subscribed=====");
//        dWeatherStation.registerObserver(Lux);
//
//        ((DemaciaWeatherStation) dWeatherStation).setWeatherData(35, 2, 1);
//        dWeatherStation.notifyObservers();
//
//        System.out.println("=====Garen got the weather information=====");
//        ((DemaciaObserver) Garen).displayWeatherData();
//
//        System.out.println("=====Lux got the weather information=====");
//        ((DemaciaObserver) Lux).displayWeatherData();
//
//        System.out.println("=====Lux unsubscribed=====");
//        dWeatherStation.removeObserver(Lux);
//        System.out.println("=====Weather changed=====");
//        ((DemaciaWeatherStation) dWeatherStation).setWeatherData(39, 2, 1);
//        dWeatherStation.notifyObservers();
//
//        System.out.println("=====Garen got the weather information=====");
//        ((DemaciaObserver) Garen).displayWeatherData();
//        System.out.println("=====Lux got the weather information=====");
//        ((DemaciaObserver) Lux).displayWeatherData();
    }
}




















