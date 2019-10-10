package com.example.designpatterns.singleton;

import sun.security.jca.GetInstance;

public class Singleton2 {

    private static class Holder {
        private static final Singleton2 SINGLETON = new Singleton2();
    }

    private Singleton2() {
        System.out.println("A SINGLETON object is created by static inner class.");
    }

    public static Singleton2 getInstance() {
        return Holder.SINGLETON;
    }

}
