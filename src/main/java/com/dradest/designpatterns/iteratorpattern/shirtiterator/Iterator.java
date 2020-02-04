package com.dradest.designpatterns.iteratorpattern.shirtiterator;

public interface Iterator {

    boolean hasNext();
    Object next();
    void remove();
}
