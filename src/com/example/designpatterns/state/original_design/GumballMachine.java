package com.example.designpatterns.state.original_design;

import org.omg.CORBA.NO_IMPLEMENT;

public class GumballMachine {

    public final static int SOLD_OUT = 0;
    public final static int NO_QUARTER = 1;
    public final static int HAS_QUARTER = 2;
    public final static int SOLD = 3;

    public int state = SOLD_OUT;

    public int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            this.state = NO_QUARTER;
        }
    }

    public void insertQuarters () {
        if (this.state == HAS_QUARTER) {
            System.out.println("You cannot insert another quarter");
        } else if (this.state == SOLD_OUT) {
            System.out.println("You cannot insert a quarter, the machine is sold out");
        } else if (this.state == SOLD) {
            System.out.println("Please wait, we're already giving you a gumball");
        } else if (this.state == NO_QUARTER){
            this.state = HAS_QUARTER;
            System.out.println("You inserted a quarter");
        }
    }

    public void ejectQuarter() {
        if (this.state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            this.state = NO_QUARTER;
        } else if (this.state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        } else if (this.state == SOLD) {
            System.out.println("Sorry, you already turned the crank");
        } else if (this.state == SOLD_OUT) {
            System.out.println("You cannot eject, you haven't inserted a quarter");
        }
    }

    public void turnCrank () {
        if (this.state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball");
        } else if (this.state == NO_QUARTER) {
            System.out.println("You turned but there is no quarter");
        } else if (this.state == SOLD_OUT) {
            System.out.println("You turned but there is no gumball");
        } else if (this.state == HAS_QUARTER) {
            System.out.println("You turned...");
            this.state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (this.state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            this.count--;
            if (this.count == 0) {
                System.out.println("Oops, out of gumballs!");
                this.state = SOLD_OUT;
            } else {
                this.state = NO_QUARTER;
            }
        } else if (this.state == NO_QUARTER) {
            System.out.println("You need ot pay first");
        } else if (this.state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        } else if (this.state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}
