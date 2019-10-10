package com.example.designpatterns.decorator;

public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Decaf();
        System.out.println(beverage.getDescription() + " , $ " + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        System.out.println(beverage1.getDescription() + " , $ " + beverage1.cost());

        Beverage beverage2 = new Mocha(beverage);
        System.out.println(beverage2.getDescription() + " , $ " + beverage2.cost());

        Beverage beverage3 = new Milk(beverage2);
        System.out.println(beverage3.getDescription() + " , $ " + beverage3.cost());

    }
}
