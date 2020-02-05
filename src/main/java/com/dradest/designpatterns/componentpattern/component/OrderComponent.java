package com.dradest.designpatterns.componentpattern.component;

import com.dradest.designpatterns.iteratorpattern.shirt.Size;

import java.util.Iterator;

public abstract class OrderComponent {
    // composite methods
    public void add(OrderComponent orderComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(OrderComponent orderComponent){
        throw new UnsupportedOperationException();
    }
    public OrderComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }

    // operation methods
    public Size getSize(){
        throw new UnsupportedOperationException();
    }
    public String getType(){
        throw new UnsupportedOperationException();
    }
    public void process(){
        throw new UnsupportedOperationException();
    }
}
