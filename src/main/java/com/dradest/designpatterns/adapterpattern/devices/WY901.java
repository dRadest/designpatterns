package com.dradest.designpatterns.adapterpattern.devices;

public class WY901 implements USLaptop {
    @Override
    public void charge() {
        System.out.println("Chargin US laptop");
    }
}
