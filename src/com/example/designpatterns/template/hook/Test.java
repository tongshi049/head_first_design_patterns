package com.example.designpatterns.template.hook;

public class Test {

    public static void main(String[] args) {
        CaffeineBeverageWithHook coffee = new CoffeeWithHook();

        coffee.prepare();
    }
}
