package com.example.designpatterns.factory.simple_pizza_factory;

public class GreekPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Greek Pizza.");
    }

    @Override
    public void bake() {
        System.out.println("Bake Greek Pizza.");
    }

    @Override
    public void cut() {
        System.out.println("Cut Greek Pizza.");
    }

    @Override
    public void box() {
        System.out.println("Box Greek Pizza.");
    }
}
