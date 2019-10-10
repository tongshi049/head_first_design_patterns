package com.example.designpatterns.mvc.example_dj;

public interface BeatModelInterface {

    // these methods are the controller will use to direct the model
    // based on user interaction.
    void initialize();

    void on();

    void off();

    void setBPM(int number);

    int getBPM();

    // these methods allow the view and controller to get state and
    // to become observers.
    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);


}
