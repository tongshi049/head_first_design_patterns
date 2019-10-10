package com.example.designpatterns.state.state_pattern_design;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert a quarter, the machine is sold out");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cannot eject, you haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
