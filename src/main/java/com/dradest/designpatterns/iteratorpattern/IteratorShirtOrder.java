package com.dradest.designpatterns.iteratorpattern;

import com.dradest.designpatterns.iteratorpattern.order.ShirtEmailOrder;
import com.dradest.designpatterns.iteratorpattern.order.ShirtPhoneOrder;
import com.dradest.designpatterns.iteratorpattern.shirt.Shirt;
import com.dradest.designpatterns.iteratorpattern.shirt.Size;
import com.dradest.designpatterns.iteratorpattern.worker.Worker;

import java.util.ArrayList;
import java.util.List;

public class IteratorShirtOrder {

    public void placeShirtOrders(){
        Shirt shirt;
        Shirt[] phoneOrderShirts = new Shirt[ShirtPhoneOrder.MAX_ITEMS];
        List<Shirt> emailOrderShirts = new ArrayList<>();

        shirt = new Shirt(Size.SIZE_L, "v-neck");
        phoneOrderShirts[0] = shirt;
        shirt = new Shirt(Size.SIZE_L, "u-neck");
        phoneOrderShirts[1] = shirt;
        shirt = new Shirt(Size.SIZE_S, "v-neck");
        phoneOrderShirts[2] = shirt;

        emailOrderShirts.add(shirt);
        shirt = new Shirt(Size.SIZE_M, "v-neck");
        emailOrderShirts.add(shirt);
        shirt = new Shirt(Size.SIZE_X, "v-neck");
        emailOrderShirts.add(shirt);
        shirt = new Shirt(Size.SIZE_X, "v-neck");
        emailOrderShirts.add(shirt);
        shirt = new Shirt(Size.SIZE_X, "u-neck");
        emailOrderShirts.add(shirt);

        ShirtPhoneOrder shirtPhoneOrder = new ShirtPhoneOrder(phoneOrderShirts);
        ShirtEmailOrder shirtEmailOrder = new ShirtEmailOrder(emailOrderShirts);

        Worker worker = new Worker(shirtPhoneOrder, shirtEmailOrder);
        worker.proccessOrders();

    }
}
