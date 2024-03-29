package com.example.designpatterns.factory.ingredient_factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggies")) {
            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("New York Style Veggies Pizza");
        }

        return pizza;
    }
}
