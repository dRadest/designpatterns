package com.dradest.designpatterns.adapterpattern.devices;

public class ZX408 implements EULaptop {
    @Override
    public void charge() {
        System.out.println("Charging EU laptop");
    }
}
