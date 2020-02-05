package com.dradest.designpatterns.componentpattern.worker;

import com.dradest.designpatterns.componentpattern.component.OrderComponent;
import com.dradest.designpatterns.componentpattern.shirt.Shirt;
import com.dradest.designpatterns.iteratorpattern.shirt.Size;

import java.util.Iterator;

public class Worker {
    private OrderComponent allOrders;

    public Worker(OrderComponent allOrders) {
        this.allOrders = allOrders;
    }

    public void processOrders(){
        allOrders.process();
    }

    public void countShirtsSizeM(){
        Iterator iterator = allOrders.createIterator();
        System.out.println("Counting shirts size M");
        int count = 0;
        while(iterator.hasNext()){
            OrderComponent orderComponent = (OrderComponent) iterator.next();
            if (orderComponent instanceof Shirt && orderComponent.getSize() == Size.SIZE_M){
                count++;
            }
        }
        System.out.println("Total count of shirts size M: " + count);
    }
}
