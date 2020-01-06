package com.dradest.designpatterns.factorypattern.carstore;

import com.dradest.designpatterns.factorypattern.car.Car;

public abstract class CarStore {
    public void orderCar(String item){
        Car car = createCar(item);
        if (car != null){
            System.out.println("Your car, " + car.getName() + ", is ready for pickup!\n");
        }else {
            System.out.println("Sorry. Car of type " + item + " is not available.\n");
        }
    }
    abstract Car createCar(String item);
}
