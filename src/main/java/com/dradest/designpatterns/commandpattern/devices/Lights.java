package com.dradest.designpatterns.commandpattern.devices;

public class Lights {
    String location;

    public Lights(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println(location + " lights turned on");
    }
    public void off(){
        System.out.println(location + " lights turned off");
    }
}
