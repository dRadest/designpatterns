package com.dradest.designpatterns.factorypattern.carfactory;

import com.dradest.designpatterns.factorypattern.carparts.chassis.Chassis;
import com.dradest.designpatterns.factorypattern.carparts.chassis.JapanCaravanChassis;
import com.dradest.designpatterns.factorypattern.carparts.chassis.JapanMinivanChassis;
import com.dradest.designpatterns.factorypattern.carparts.chassis.JapanSportsCarChassis;
import com.dradest.designpatterns.factorypattern.carparts.electricity.Electricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.JapanCaravanElectricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.JapanMinivanElectricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.JapanSportsCarElectricity;
import com.dradest.designpatterns.factorypattern.carparts.tyres.JapanCaravanTyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.JapanMinivanTyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.JapanSportsCarTyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.Tyres;

public class JapanCarFactory implements CarFactory {
    @Override
    public Chassis createChassis(String carType) {
        System.out.println("Making chassis in Japan");
        if (carType.equals("caravan")){
            return new JapanCaravanChassis();
        }
        if (carType.equals("minivan")){
            return new JapanMinivanChassis();
        }
        if (carType.equals("sports")){
            return new JapanSportsCarChassis();
        }
        return null;
    }

    @Override
    public Tyres createTyres(String carType) {
        System.out.println("Making tyres in Japan");
        if (carType.equals("caravan")){
            return new JapanCaravanTyres();
        }
        if (carType.equals("minivan")){
            return new JapanMinivanTyres();
        }
        if (carType.equals("sports")){
            return new JapanSportsCarTyres();
        }
        return null;
    }

    @Override
    public Electricity doElectricJob(String carType) {
        System.out.println("Doing electric job in Japan");
        if (carType.equals("caravan")){
            return new JapanCaravanElectricity();
        }
        if (carType.equals("minivan")){
            return new JapanMinivanElectricity();
        }
        if (carType.equals("sports")){
            return new JapanSportsCarElectricity();
        }
        return null;
    }
}
