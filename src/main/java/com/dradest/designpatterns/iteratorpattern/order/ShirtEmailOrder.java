package com.dradest.designpatterns.iteratorpattern.order;

import com.dradest.designpatterns.iteratorpattern.shirt.Shirt;
import com.dradest.designpatterns.iteratorpattern.shirtiterator.Iterator;
import com.dradest.designpatterns.iteratorpattern.shirtiterator.ShirtEmailIterator;

import java.util.List;

public class ShirtEmailOrder implements ShirtOrder {
    private static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    List<Shirt> items;

    public ShirtEmailOrder(List<Shirt> items) {
        this.items = items;
    }

    @Override
    public Iterator createIterator() {
        return new ShirtEmailIterator(items);
    }

}
