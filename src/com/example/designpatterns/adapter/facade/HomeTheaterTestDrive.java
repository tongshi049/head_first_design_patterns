package com.example.designpatterns.adapter.facade;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        DvdPlayer dvdPlayer = new DvdPlayer();
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner(amplifier);
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector(dvdPlayer);
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();

        HomeTheaterFacade facade =
                new HomeTheaterFacade(
                        amplifier, tuner, dvdPlayer, projector,
                        lights, screen, popcornPopper);

        facade.watchMovie("Spider man");
        facade.endMovie();
    }
}
