package com.example.designpatterns.state.imporved_version;

public abstract class State {

    void insertQuarter() {
        System.out.println("You have already inserted a quarter");
    }

    void ejectQuarter() {
        System.out.println("Sorry, we cannot eject quarter");
    }

    void turnCrank() {
        System.out.println("Please insert a quarter at first");
    }

    void dispense() {
        System.out.println("The gumballs have been sold out.");
    }
}
