package com.dradest.designpatterns.factorypattern.carfactory;

import com.dradest.designpatterns.factorypattern.carparts.chassis.*;
import com.dradest.designpatterns.factorypattern.carparts.electricity.Electricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.FranceCaravanElectricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.FranceMinivanElectricity;
import com.dradest.designpatterns.factorypattern.carparts.electricity.FranceSportsCarElectricity;
import com.dradest.designpatterns.factorypattern.carparts.tyres.FranceCaravanTyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.FranceMinivanTyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.FranceSportsCarTyres;
import com.dradest.designpatterns.factorypattern.carparts.tyres.Tyres;

public class FranceCarFactory implements CarFactory {
    @Override
    public Chassis createChassis(String carType) {
        System.out.println("Making chassis in France");
        if (carType.equals("caravan")){
            return new FranceCaravanChassis();
        }
        if (carType.equals("minivan")){
            return new FranceMinivanChassis();
        }
        if (carType.equals("sports")){
            return new FranceSportsCarChassis();
        }
        return null;
    }

    @Override
    public Tyres createTyres(String carType) {
        System.out.println("Making tyres in France");
        if (carType.equals("caravan")){
            return new FranceCaravanTyres();
        }
        if (carType.equals("minivan")){
            return new FranceMinivanTyres();
        }
        if (carType.equals("sports")){
            return new FranceSportsCarTyres();
        }
        return null;
    }

    @Override
    public Electricity doElectricJob(String carType) {
        System.out.println("Doing electric job in France");
        if (carType.equals("caravan")){
            return new FranceCaravanElectricity();
        }
        if (carType.equals("minivan")){
            return new FranceMinivanElectricity();
        }
        if (carType.equals("sports")){
            return new FranceSportsCarElectricity();
        }
        return null;
    }
}
