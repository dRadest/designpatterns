package com.dradest.designpatterns.commandpattern.devices;

public class CeillingFan {
    public static final int OFF = 0;
    public static final int LOW = 1;
    public static final int MEDIUM = 2;
    public static final int HIGH = 3;

    private String location;
    private int speed;

    public CeillingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void low(){
        speed = LOW;
        System.out.println("Fan turned on low");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println("Fan turned on medium");
    }

    public void high(){
        speed = HIGH;
        System.out.println("Fan turned on high");
    }

    public void off(){
        speed = OFF;
        System.out.println("Fan turned off");
    }

    public int getSpeed() {
        return speed;
    }
}
