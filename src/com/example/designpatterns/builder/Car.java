package com.example.designpatterns.builder;

public class Car {
    String color;
    int wheel;

    public Car(int wheel, String color) {
        this.wheel = wheel;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", wheel=" + wheel +
                '}';
    }
}
