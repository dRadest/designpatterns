package com.dradest.designpatterns.factorypattern.car;

import com.dradest.designpatterns.factorypattern.carfactory.CarFactory;

public class SportsCar extends Car {
    CarFactory carFactory;
    String type;

    public SportsCar(CarFactory carFactory, String type) {
        this.carFactory = carFactory;
        this.type = type;
        assemble();
    }

    @Override
    void assemble() {
        System.out.println("Assembling sport car...");
        chassis = carFactory.createChassis(type);
        tyres = carFactory.createTyres(type);
        electricity = carFactory.doElectricJob(type);
    }
}
