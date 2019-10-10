package com.example.designpatterns.adapter;

/*
*  Implement the interface of the type you're adapting to.
*  This is the interface your client expects to see.
* */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    /*
    * We need to get a reference to the object that we are adapting;
    * here we do that through the constructor.
    *
    * */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /*
    *  Here we need to implement all the methods in the interface;
    * */
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++)
            turkey.fly();
    }
}
