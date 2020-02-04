package com.dradest.designpatterns.iteratorpattern.shirtiterator;

import com.dradest.designpatterns.iteratorpattern.shirt.Shirt;

public class ShirtPhoneIterator implements Iterator {

    private Shirt[] items;
    private int position = 0;

    public ShirtPhoneIterator(Shirt[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Shirt shirt = items[position];
        position += 1;
        return shirt;
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException("Have to do at least one next() before removing an item");
        }
        if (items[position-1] != null){
            for (int i=position-1; i<(items.length-1); i++){
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
