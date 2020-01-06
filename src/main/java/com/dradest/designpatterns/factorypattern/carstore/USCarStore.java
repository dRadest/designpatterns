package com.dradest.designpatterns.factorypattern.carstore;

import com.dradest.designpatterns.factorypattern.car.Car;
import com.dradest.designpatterns.factorypattern.car.Caravan;
import com.dradest.designpatterns.factorypattern.car.Minivan;
import com.dradest.designpatterns.factorypattern.car.SportsCar;
import com.dradest.designpatterns.factorypattern.carfactory.CarFactory;
import com.dradest.designpatterns.factorypattern.carfactory.USCarFactory;

public class USCarStore extends CarStore {
    @Override
    Car createCar(String item) {
        Car car = null;
        CarFactory usCarFactory = new USCarFactory();
        if (item.equals("caravan")){
            car = new Caravan(usCarFactory, item);
            car.setName("Caravan made in USA");
        }else if (item.equals("minivan")){
            car = new Minivan(usCarFactory, item);
            car.setName("Minivan made in USA");
        }else if (item.equals("sports")){
            car = new SportsCar(usCarFactory, item);
            car.setName("Sports car made in USA");
        }

        return car;
    }
}
