package com.dradest.designpatterns.iteratorpattern.shirtiterator;

import com.dradest.designpatterns.iteratorpattern.shirt.Shirt;

import java.util.List;

public class ShirtEmailIterator implements Iterator {
    List<Shirt> items;
    int position = 0;

    public ShirtEmailIterator(List<Shirt> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Shirt shirt = items.get(position);
        position += 1;
        return shirt;
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException("Have to do at least one next() before removing an item");
        }
        if (items.get(position-1) != null){
            for(int i=position-1; i< items.size()-1; i++){
                items.add(i, items.get(i+1));
            }
            items.add(items.size()-1, null);
        }
    }
}
