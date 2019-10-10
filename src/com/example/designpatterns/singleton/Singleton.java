package com.example.designpatterns.singleton;

public class Singleton {

    private volatile static Singleton SINGLETON;
    private static Object lock = new Object();

    private Singleton() {
        System.out.println("An only one object is created");
    }

    public static Singleton getInstance() {

        if (SINGLETON == null) {
            synchronized (lock) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton();
                }
            }
        }

        return SINGLETON;
    }


}
