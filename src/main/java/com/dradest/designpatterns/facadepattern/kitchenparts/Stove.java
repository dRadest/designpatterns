package com.dradest.designpatterns.facadepattern.kitchenparts;

public class Stove {
    public void turnOn(){
        System.out.println("Turning stove on");
    }

    public void sauteOnion(){
        System.out.println("Saute onions");
    }

    public void cookVegetables(){
        System.out.println("Cook vegetables");
    }

    public void clean(){
        System.out.println("Cleaning stove");
    }

    public void turnOff(){
        System.out.println("Turning stove off");
    }
}
