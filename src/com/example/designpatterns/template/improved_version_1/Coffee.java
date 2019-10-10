package com.example.designpatterns.template.improved_version_1;

import com.example.designpatterns.template.improved_version_1.CaffeineBeverageVersion1;

public class Coffee extends CaffeineBeverageVersion1 {
    @Override
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void brewCoffeeGrinds () {
        System.out.println("Dripping Coffee through filter");
    }


    public void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}
