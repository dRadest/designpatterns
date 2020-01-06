package com.dradest.designpatterns.factorypattern.carfactory;

import com.dradest.designpatterns.factorypattern.carparts.chassis.Chassis;
import com.dradest.designpatterns.factorypattern.carparts.electricity.Electricity;
import com.dradest.designpatterns.factorypattern.carparts.tyres.Tyres;

public interface CarFactory {
    public Chassis createChassis(String carType);
    public Tyres createTyres(String carType);
    public Electricity doElectricJob(String carType);
}
