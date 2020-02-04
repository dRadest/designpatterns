package com.dradest.designpatterns.iteratorpattern.worker;

import com.dradest.designpatterns.iteratorpattern.order.ShirtEmailOrder;
import com.dradest.designpatterns.iteratorpattern.order.ShirtOrder;
import com.dradest.designpatterns.iteratorpattern.order.ShirtPhoneOrder;
import com.dradest.designpatterns.iteratorpattern.shirt.Shirt;
import com.dradest.designpatterns.iteratorpattern.shirtiterator.Iterator;

public class Worker {
    ShirtOrder shirtPhoneOrder;
    ShirtOrder shirtEmailOrder;

    public Worker(ShirtOrder shirtPhoneOrder, ShirtOrder shirtEmailOrder) {
        this.shirtPhoneOrder = shirtPhoneOrder;
        this.shirtEmailOrder = shirtEmailOrder;
    }

    public void proccessOrders(){
        Iterator shirtPhoneIterator = shirtPhoneOrder.createIterator();
        Iterator shirtEmailIterator = shirtEmailOrder.createIterator();
        System.out.println("======= Phone Orders =======");
        printOrder(shirtPhoneIterator);
        System.out.println("======= Email Orders =======");
        printOrder(shirtEmailIterator);
    }

    private void printOrder(Iterator iterator){
        while(iterator.hasNext()){
            Shirt shirt = (Shirt)iterator.next();
            System.out.println("Shirt type: " + shirt.getType());
            System.out.println("Shirt size: " + shirt.getSize());
        }
    }
}
