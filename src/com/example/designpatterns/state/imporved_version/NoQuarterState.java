package com.example.designpatterns.state.imporved_version;

public class NoQuarterState extends State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    void insertQuarter() {
        System.out.println("You have already inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

}
