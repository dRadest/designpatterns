package com.dradest.designpatterns.iteratorpattern.order;

import com.dradest.designpatterns.iteratorpattern.shirt.Shirt;
import com.dradest.designpatterns.iteratorpattern.shirtiterator.Iterator;
import com.dradest.designpatterns.iteratorpattern.shirtiterator.ShirtPhoneIterator;

public class ShirtPhoneOrder implements ShirtOrder {
    public static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Shirt[] items;

    public ShirtPhoneOrder(Shirt[] items) {
        this.items = items;
    }

    @Override
    public Iterator createIterator() {
        return new ShirtPhoneIterator(items);
    }

}
