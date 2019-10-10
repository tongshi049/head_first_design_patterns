package com.example.designpatterns.state.imporved_version;

public class SoldOutState extends State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    void insertQuarter() {
        System.out.println("You cannot insert a quarter, the machine is sold out");
    }

    @Override
    void ejectQuarter() {
        System.out.println("You cannot eject, you haven't inserted a quarter");
    }

    @Override
    void turnCrank() {
        System.out.println("You turned but there is no gumball");
    }

    @Override
    void dispense() {
        System.out.println("No gumball dispensed");
    }

}
