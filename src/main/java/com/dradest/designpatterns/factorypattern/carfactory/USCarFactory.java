package com.dradest.designpatterns.factorypattern.carfactory;

import com.dradest.designpatterns.factorypattern.carparts.chassis.Chassis;
import com.dradest.designpatterns.factorypattern.carparts.chassis.USCaravanChassis;
import com.dradest.designpatterns.factorypattern.carparts.chassis.USMinivanChassis;
import com.dradest.designpatterns.factorypattern.carparts.chassis.USSportsCarChassis;
import com.dradest.designpatterns.factorypattern.carparts.electricity.Electricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.USCaravanElectricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.USMinivanElectricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.USSportsCarElectricity;
import com.dradest.designpatterns.factorypattern.carparts.tyres.Tyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.USCaravanTyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.USMinivanTyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.USSportsCarTyres;

public class USCarFactory implements CarFactory {
    @Override
    public Chassis createChassis(String carType) {
        System.out.println("Making chassis in USA");
        if (carType.equals("caravan")){
            return new USCaravanChassis();
        }
        if (carType.equals("minivan")){
            return new USMinivanChassis();
        }
        if (carType.equals("sports")){
            return new USSportsCarChassis();
        }
        return null;
    }

    @Override
    public Tyres createTyres(String carType) {
        System.out.println("Making tyres in USA");
        if (carType.equals("caravan")){
            return new USCaravanTyres();
        }
        if (carType.equals("minivan")){
            return new USMinivanTyres();
        }
        if (carType.equals("sports")){
            return new USSportsCarTyres();
        }
        return null;
    }

    @Override
    public Electricity doElectricJob(String carType) {
        System.out.println("Doing electric job in USA");
        if (carType.equals("caravan")){
            return new USCaravanElectricity();
        }
        if (carType.equals("minivan")){
            return new USMinivanElectricity();
        }
        if (carType.equals("sports")){
            return new USSportsCarElectricity();
        }
        return null;
    }
}
