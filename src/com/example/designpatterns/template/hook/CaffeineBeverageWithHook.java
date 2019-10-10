package com.example.designpatterns.template.hook;

public abstract class CaffeineBeverageWithHook {

    void prepare() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater () {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /*
    * This is a hook, because the subclass can
    * override this method, but doesn't have to.
    * */
    public boolean customerWantsCondiments () {
        return true;
    }
}
