package com.dradest.designpatterns.componentpattern.order;

import com.dradest.designpatterns.componentpattern.component.OrderComponent;
import com.dradest.designpatterns.componentpattern.iterator.CompositeIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Order extends OrderComponent {
    private String type;
    private List<OrderComponent> orderComponents = new ArrayList<>();
    private Iterator iterator = null;

    public Order(String type) {
        this.type = type;
    }

    @Override
    public Iterator createIterator(){
        if (iterator == null){
            iterator = new CompositeIterator(orderComponents.iterator());
        }
        return iterator;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void add(OrderComponent orderComponent) {
        orderComponents.add(orderComponent);
    }

    @Override
    public void remove(OrderComponent orderComponent) {
        orderComponents.remove(orderComponent);
    }

    @Override
    public OrderComponent getChild(int i) {
        return orderComponents.get(i);
    }

    @Override
    public void process() {
        System.out.println("Processing orders: " + getType());

        Iterator iterator = orderComponents.iterator();
        while(iterator.hasNext()){
            OrderComponent orderComponent = (OrderComponent) iterator.next();
            orderComponent.process();
        }
    }
}
