package com.example.designpatterns.factory.simple_pizza_factory;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new CheesePizza();
        else if (type.equals("pepperoni"))
            pizza = new PepperoniPizza();
        else if (type.equals("greek"))
            pizza = new GreekPizza();

        return pizza;
    }
}
