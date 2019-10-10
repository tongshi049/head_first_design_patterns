package com.example.designpatterns.state.state_pattern_design;

import java.util.Random;

public class HasQuarterState implements State {

    Random random = new Random(System.currentTimeMillis());

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("You cannot insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned ... ");
        int winner = random.nextInt(10);
        if (winner == 0 && gumballMachine.getCount() > 1)
            gumballMachine.setState(gumballMachine.getWinnerState());
        else
            gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}