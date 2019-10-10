package com.example.designpatterns.factory.ingredient_factory;

import com.example.designpatterns.factory.ingredient_factory.ingredients.Cheese;
import com.example.designpatterns.factory.ingredient_factory.ingredients.Dough;
import com.example.designpatterns.factory.ingredient_factory.ingredients.Sauce;
import com.example.designpatterns.factory.ingredient_factory.ingredients.Veggies;

import java.util.Arrays;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies[] veggies;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", veggies=" + Arrays.toString(veggies) +
                '}';
    }
}
