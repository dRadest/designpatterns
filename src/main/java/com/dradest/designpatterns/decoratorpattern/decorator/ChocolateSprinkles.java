package com.dradest.designpatterns.decoratorpattern.decorator;

import com.dradest.designpatterns.decoratorpattern.product.Product;

public class ChocolateSprinkles extends CondimentDecorator {
    Product product;

    public ChocolateSprinkles(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Chocolate Sprinkles";
    }

    @Override
    public Double cost() {
        return product.cost() + .99;
    }
}
