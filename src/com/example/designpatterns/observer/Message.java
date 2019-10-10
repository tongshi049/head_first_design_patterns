package com.example.designpatterns.observer;

public enum Message {

    SUCCESS(0, "You have successully registed!"),
    FAILURE(1, "You fail to registed");

    private int state;
    private String info;

    private Message(int state, String info) {
        this.state = state; this.info = info;
    }

    public String getInfo() {
        return this.info;
    }
}
