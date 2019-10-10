package com.example.designpatterns.factory.pizza_factory;

public class NYCheesePizza extends Pizza {

    public NYCheesePizza() {
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
