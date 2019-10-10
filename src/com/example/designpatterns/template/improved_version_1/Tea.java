package com.example.designpatterns.template.improved_version_1;

import com.example.designpatterns.template.improved_version_1.CaffeineBeverageVersion1;

public class Tea extends CaffeineBeverageVersion1 {
    @Override
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    public void steepTeaBag () {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding lemon");
    }
}
