package com.dradest.designpatterns.componentpattern.iterator;

import com.dradest.designpatterns.componentpattern.component.OrderComponent;
import com.dradest.designpatterns.componentpattern.order.Order;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty()){
            return false;
        }else {
            Iterator iterator = stack.peek();
            if (!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (hasNext()){
            Iterator iterator = stack.peek();
            OrderComponent orderComponent = (OrderComponent) iterator.next();
            if (orderComponent instanceof Order){
                stack.push(orderComponent.createIterator());
            }
            return orderComponent;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
