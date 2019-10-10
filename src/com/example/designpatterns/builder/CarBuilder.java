package com.example.designpatterns.builder;

public class CarBuilder {
    int wheel;
    String color;

    public CarBuilder(){}

    public CarBuilder setWheel(int wheel) {
        this.wheel = wheel;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(this.wheel, this.color);
    }
}
