package com.dradest.designpatterns.decoratorpattern.decorator;

import com.dradest.designpatterns.decoratorpattern.product.Product;

public class FreshStrawberries extends CondimentDecorator {
    Product product;

    public FreshStrawberries(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Fresh Strawberries";
    }

    @Override
    public Double cost() {
        return product.cost() + 1.09;
    }
}
