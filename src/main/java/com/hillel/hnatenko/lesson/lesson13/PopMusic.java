package com.hillel.hnatenko.lesson.lesson13;

public class PopMusic extends MusicStyles{

    String name;

    public PopMusic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void playMusic() {
        System.out.println(name + " - Play pop music");
    }
}
