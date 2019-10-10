package com.example.designpatterns.proxy.gumball;

public class Test {

    public static void main(String[] args) {

        GumballMachine gumballMachine = new GumballMachine(5, "Room1");

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        monitor.report();



    }
}
