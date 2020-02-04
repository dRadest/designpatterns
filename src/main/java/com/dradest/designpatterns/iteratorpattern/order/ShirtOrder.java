package com.dradest.designpatterns.iteratorpattern.order;

import com.dradest.designpatterns.iteratorpattern.shirtiterator.Iterator;

public interface ShirtOrder {

    Iterator createIterator();
}
