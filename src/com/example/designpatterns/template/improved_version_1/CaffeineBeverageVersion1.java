package com.example.designpatterns.template.improved_version_1;

public abstract class CaffeineBeverageVersion1 {

    /*
    * prepare method differs in each subclass,
    * so it is defined as abstract
    * */
    abstract void prepareRecipe ();

    public void boilWater () {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
