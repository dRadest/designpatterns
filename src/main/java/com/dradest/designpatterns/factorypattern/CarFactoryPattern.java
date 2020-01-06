package com.dradest.designpatterns.factorypattern;

import com.dradest.designpatterns.factorypattern.carstore.CarStore;
import com.dradest.designpatterns.factorypattern.carstore.FranceCarStore;
import com.dradest.designpatterns.factorypattern.carstore.JapanCarStore;
import com.dradest.designpatterns.factorypattern.carstore.USCarStore;

public class CarFactoryPattern {

    public void orderCars(){
        CarStore japanCarStore = new JapanCarStore();
        japanCarStore.orderCar("minivan");
        CarStore franceCarStore = new FranceCarStore();
        franceCarStore.orderCar("caravan");
        CarStore usCarStore = new USCarStore();
        usCarStore.orderCar("yugo");
        usCarStore.orderCar("sports");
    }
}
