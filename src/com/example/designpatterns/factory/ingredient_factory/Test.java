package com.example.designpatterns.factory.ingredient_factory;

public class Test {

    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();

        store.orderPizza("cheese");
    }
}
