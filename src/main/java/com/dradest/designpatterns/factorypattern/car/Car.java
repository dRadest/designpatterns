package com.dradest.designpatterns.factorypattern.car;

import com.dradest.designpatterns.factorypattern.carparts.chassis.Chassis;
import com.dradest.designpatterns.factorypattern.carparts.electricity.Electricity;
import com.dradest.designpatterns.factorypattern.carparts.tyres.Tyres;

public abstract class Car {
    String name;
    Chassis chassis;
    Tyres tyres;
    Electricity electricity;

    abstract void assemble();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void priceTag(){
        System.out.println("Putting a price tag on a car " + name);
    }
}
