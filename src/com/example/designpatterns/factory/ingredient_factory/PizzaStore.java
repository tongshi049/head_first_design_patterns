package com.example.designpatterns.factory.ingredient_factory;

import com.example.designpatterns.factory.ingredient_factory.Pizza;

/*
 *  A framework that ties the store and the pizza creation together
 * */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        pizza = createPizza(type); // createPizza is being a call to a method in pizza store
                                   // rather than on a factory object

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type); // move factory object to this method
}
