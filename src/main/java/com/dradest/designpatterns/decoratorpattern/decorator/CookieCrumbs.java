package com.dradest.designpatterns.decoratorpattern.decorator;

import com.dradest.designpatterns.decoratorpattern.product.Product;

public class CookieCrumbs extends CondimentDecorator {
    private Product product;

    public CookieCrumbs(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Chocolate Sprinkles";
    }

    @Override
    public Double cost() {
        return product.cost() + 1.19;
    }
}
