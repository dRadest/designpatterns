package com.dradest.designpatterns.factorypattern.car;

import com.dradest.designpatterns.factorypattern.carfactory.CarFactory;

public class Caravan extends Car {
    CarFactory carFactory;
    String type;

    public Caravan(CarFactory carFactory, String type) {
        this.carFactory = carFactory;
        this.type = type;
        assemble();
    }

    @Override
    void assemble() {
        System.out.println("Assembling caravan...");
        chassis = carFactory.createChassis(type);
        tyres = carFactory.createTyres(type);
        electricity = carFactory.doElectricJob(type);
    }
}
