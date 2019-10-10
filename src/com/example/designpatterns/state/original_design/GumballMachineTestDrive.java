package com.example.designpatterns.state.original_design;

public class GumballMachineTestDrive {

    public static void main(String[] args) {

        GumballMachine machine = new GumballMachine(5);
        machine.insertQuarters();
        machine.turnCrank();
        System.out.println(machine);

        machine.insertQuarters();
        machine.ejectQuarter();
        machine.turnCrank();
        System.out.println(machine);

        machine.insertQuarters();
        machine.turnCrank();
        machine.insertQuarters();
        machine.turnCrank();
        machine.ejectQuarter();
        System.out.println(machine);

        machine.insertQuarters();
        machine.insertQuarters();
        machine.turnCrank();
        machine.insertQuarters();
        machine.turnCrank();
        machine.insertQuarters();
        machine.turnCrank();
        System.out.println(machine);

    }
}
