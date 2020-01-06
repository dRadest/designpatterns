package com.dradest.designpatterns.factorypattern.carstore;

import com.dradest.designpatterns.factorypattern.car.Car;
import com.dradest.designpatterns.factorypattern.car.Caravan;
import com.dradest.designpatterns.factorypattern.car.Minivan;
import com.dradest.designpatterns.factorypattern.car.SportsCar;
import com.dradest.designpatterns.factorypattern.carfactory.CarFactory;
import com.dradest.designpatterns.factorypattern.carfactory.FranceCarFactory;

public class FranceCarStore extends CarStore {
    @Override
    Car createCar(String item) {
        Car car = null;
        CarFactory franceCarFactory = new FranceCarFactory();
        if (item.equals("caravan")){
            car = new Caravan(franceCarFactory, item);
            car.setName("Caravan made in France");
        }else if (item.equals("minivan")){
            car = new Minivan(franceCarFactory, item);
            car.setName("Minivan made in France");
        }else if (item.equals("sports")){
            car = new SportsCar(franceCarFactory, item);
            car.setName("Sports car made in France");
        }

        return car;
    }
}
