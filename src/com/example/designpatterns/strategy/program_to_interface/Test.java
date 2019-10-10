package com.example.designpatterns.strategy.program_to_interface;

public class Test {

    public static void main(String[] args) {
        Duck duck = new RedheadDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        Duck coolDuck = new CoolDuck();
        coolDuck.setFlyBehavior(new FlyWithWings());
        coolDuck.setQuackBehavior(new Squeak());
        coolDuck.performQuack();
        coolDuck.performFly();
    }


}
