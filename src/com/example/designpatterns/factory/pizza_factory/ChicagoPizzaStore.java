package com.example.designpatterns.factory.pizza_factory;

/*
* The subclass of Pizza Store handle object instantiation for us in the createPizza() method
*
* */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese"))
            pizza = new ChicagoCheesePizza();
        else if (type.equals("greek"))
            pizza = new ChicagoGreekPizza();

        return pizza;
    }
}
