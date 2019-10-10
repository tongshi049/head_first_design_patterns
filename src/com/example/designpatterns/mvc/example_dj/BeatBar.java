package com.example.designpatterns.mvc.example_dj;

import javax.swing.*;
import java.io.Serializable;

public class BeatBar extends JProgressBar implements  Runnable {

    private static final long serialVersionUID = 2352942497583670544L;
    JProgressBar progressBar;
    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        for(;;) {
            int value = getValue();
            value = (int)(value * .75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(50);
            } catch (Exception e) {};
        }
    }

}
