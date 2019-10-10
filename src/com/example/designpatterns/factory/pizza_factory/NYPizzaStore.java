package com.example.designpatterns.factory.pizza_factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new NYCheesePizza();
        else if (type.equals("greek"))
            pizza = new NYGreekPizza();

        return pizza;
    }
}
