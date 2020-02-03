package com.dradest.designpatterns.commandpattern.devices;

public class Stereo {
    int volume;

    public void on(){
        System.out.println("Stereo turned on");
    }

    public void off(){
        System.out.println("Stereo turned off");
    }

    public void setPlaylist(){
        System.out.println("Our favorite songs playlist set.");
    }

    public void setRadio(){
        System.out.println("Our favorite radio station set.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
