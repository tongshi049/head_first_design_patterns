package com.example.designpatterns.factory.pizza_factory;

public class NYGreekPizza extends Pizza {

    public NYGreekPizza() {
        name = "NY style sauce and greek pizza";
        dough = "Thin crust dough";
        sauce = "Marinara Sauce";

        toppings.add("Some vegetables");
    }
}
