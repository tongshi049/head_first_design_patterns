package com.example.designpatterns.state.imporved_version;

public class HasQuarterState extends State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    void turnCrank() {
        System.out.println("You turned ... ");
        this.gumballMachine.setState(this.gumballMachine.getSoldState());
    }
}
