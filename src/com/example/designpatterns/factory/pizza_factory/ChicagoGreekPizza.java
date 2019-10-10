package com.example.designpatterns.factory.pizza_factory;

public class ChicagoGreekPizza extends Pizza {

    public ChicagoGreekPizza() {
        name = "Chicago style sauce and greek pizza";

        dough = "Extra thick crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Cheese and vegetables");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
