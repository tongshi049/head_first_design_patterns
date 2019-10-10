package com.example.designpatterns.factory.ingredient_factory;

import com.example.designpatterns.factory.ingredient_factory.ingredients.Cheese;
import com.example.designpatterns.factory.ingredient_factory.ingredients.Dough;
import com.example.designpatterns.factory.ingredient_factory.ingredients.Sauce;
import com.example.designpatterns.factory.ingredient_factory.ingredients.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
}
