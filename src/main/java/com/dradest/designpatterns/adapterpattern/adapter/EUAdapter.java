package com.dradest.designpatterns.adapterpattern.adapter;

import com.dradest.designpatterns.adapterpattern.devices.EULaptop;
import com.dradest.designpatterns.adapterpattern.devices.USLaptop;

public class EUAdapter implements USLaptop {
    EULaptop euLaptop;

    public EUAdapter(EULaptop euLaptop) {
        this.euLaptop = euLaptop;
        System.out.println("Eu laptop plugged to the adapter");
    }

    @Override
    public void charge() {
        euLaptop.charge();
    }
}
