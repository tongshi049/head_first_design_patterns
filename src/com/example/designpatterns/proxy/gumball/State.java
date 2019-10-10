package com.example.designpatterns.proxy.gumball;

/*
* An interface for all states.
* The methods map directly to actions that could happen
* to the Gumball Machine.
* */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}


