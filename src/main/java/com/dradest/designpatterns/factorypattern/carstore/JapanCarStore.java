package com.dradest.designpatterns.factorypattern.carstore;

import com.dradest.designpatterns.factorypattern.car.Car;
import com.dradest.designpatterns.factorypattern.car.Caravan;
import com.dradest.designpatterns.factorypattern.car.Minivan;
import com.dradest.designpatterns.factorypattern.car.SportsCar;
import com.dradest.designpatterns.factorypattern.carfactory.CarFactory;
import com.dradest.designpatterns.factorypattern.carfactory.JapanCarFactory;

public class JapanCarStore extends CarStore {
    @Override
    Car createCar(String item) {
        Car car = null;
        CarFactory japanCarFactory = new JapanCarFactory();
        if (item.equals("caravan")){
            car = new Caravan(japanCarFactory, item);
            car.setName("Caravan made in Japan");
        }else if (item.equals("minivan")){
            car = new Minivan(japanCarFactory, item);
            car.setName("Minivan made in Japan");
        }else if (item.equals("sports")){
            car = new SportsCar(japanCarFactory, item);
            car.setName("Sports car made in Japan");
        }
        return car;
    }
}
