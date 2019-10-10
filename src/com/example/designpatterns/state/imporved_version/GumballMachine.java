package com.example.designpatterns.state.imporved_version;

public class GumballMachine {

    private State hasQuarterState;
    private State noQuarterState;
    private State soldState;
    private State soldOutState;

    private State state;
    private int count;

    public GumballMachine(int count) {

        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);

        this.count = count;

        if (count > 0)
            this.state = noQuarterState;
        else
            this.state = soldOutState;
    }

    public void insert() {
        this.state.insertQuarter();
    }

    public void eject() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ... ");
        if (count != 0)
            count--;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state.getClass().getSimpleName() +
                ", count=" + count +
                '}';
    }
}
