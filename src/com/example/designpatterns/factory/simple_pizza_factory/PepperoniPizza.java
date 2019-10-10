package com.example.designpatterns.factory.simple_pizza_factory;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Pepperoni Pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Bake Pepperoni Pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cut Pepperoni Pizza.");
    }

    @Override
    public void box() {
        System.out.println("Box Pepperoni Pizza.");
    }
}
