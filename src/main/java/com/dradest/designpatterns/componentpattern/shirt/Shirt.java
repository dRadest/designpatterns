package com.dradest.designpatterns.componentpattern.shirt;

import com.dradest.designpatterns.componentpattern.component.OrderComponent;
import com.dradest.designpatterns.componentpattern.iterator.NullIterator;
import com.dradest.designpatterns.iteratorpattern.shirt.Size;

import java.util.Iterator;

public class Shirt extends OrderComponent {
    private Size size;
    private String type;

    public Shirt(Size size, String type) {
        this.size = size;
        this.type = type;
    }

    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }

    @Override
    public Size getSize() {
        return this.size;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void process() {
        System.out.println("Shirt: " + getType() + " size: " + getSize());
    }
}
