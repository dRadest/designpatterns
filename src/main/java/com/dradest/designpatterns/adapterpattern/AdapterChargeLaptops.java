package com.dradest.designpatterns.adapterpattern;

import com.dradest.designpatterns.adapterpattern.adapter.EUAdapter;
import com.dradest.designpatterns.adapterpattern.devices.EULaptop;
import com.dradest.designpatterns.adapterpattern.devices.USLaptop;
import com.dradest.designpatterns.adapterpattern.devices.WY901;
import com.dradest.designpatterns.adapterpattern.devices.ZX408;

public class AdapterChargeLaptops {

    public void chargeLaptops(){
        USLaptop usLaptop = new WY901();
        usLaptop.charge();

        EULaptop euLaptop = new ZX408();
        USLaptop euAdapter = new EUAdapter(euLaptop);
        euAdapter.charge();
    }
}
