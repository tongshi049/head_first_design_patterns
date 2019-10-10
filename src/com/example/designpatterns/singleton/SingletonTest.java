package com.example.designpatterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        Singleton2 singleton21 = Singleton2.getInstance();
    }

}
