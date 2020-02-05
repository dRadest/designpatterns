package com.dradest.designpatterns.componentpattern;

import com.dradest.designpatterns.componentpattern.component.OrderComponent;
import com.dradest.designpatterns.componentpattern.order.Order;
import com.dradest.designpatterns.componentpattern.shirt.Shirt;
import com.dradest.designpatterns.componentpattern.worker.Worker;
import com.dradest.designpatterns.iteratorpattern.shirt.Size;

public class ComponentShirtOrders {

    public void placeShirtOrders(){
        OrderComponent allOrders = new Order("Root node (container of all orders)");

        OrderComponent phoneOrders = new Order("Phone order placed on Monday");
        Shirt shirtOne = new Shirt(Size.SIZE_L, "v-neck");
        phoneOrders.add(shirtOne);
        Shirt shirtTwo = new Shirt(Size.SIZE_M, "u-neck");
        phoneOrders.add(shirtTwo);
        Shirt shirtThree = new Shirt(Size.SIZE_S, "v-neck");
        phoneOrders.add(shirtThree);
        allOrders.add(phoneOrders);

        OrderComponent emailOrdersContainer = new Order("Container of all email orders");
        Shirt shirtFour = new Shirt(Size.SIZE_X, "u-neck");
        emailOrdersContainer.add(shirtFour);
        OrderComponent emailOrdersTuesday = new Order("Email orders placed on Tuesday");
        Shirt shirtFive = new Shirt(Size.SIZE_L, "u-neck");
        emailOrdersTuesday.add(shirtFive);
        Shirt shirtSix = new Shirt(Size.SIZE_X, "v-neck");
        emailOrdersTuesday.add(shirtSix);
        emailOrdersContainer.add(emailOrdersTuesday);
        OrderComponent emailOrdersThursday = new Order("Email orders placed on Thursday");
        Shirt shirtSeven = new Shirt(Size.SIZE_S, "u-neck");
        emailOrdersThursday.add(shirtSeven);
        emailOrdersContainer.add(emailOrdersThursday);
        Shirt shirtEight = new Shirt(Size.SIZE_M, "v-neck");
        emailOrdersContainer.add(shirtEight);
        allOrders.add(emailOrdersContainer);

        allOrders.add(shirtOne);

        Worker worker = new Worker(allOrders);
        worker.processOrders();
        System.out.println();
        worker.countShirtsSizeM();

    }
}
