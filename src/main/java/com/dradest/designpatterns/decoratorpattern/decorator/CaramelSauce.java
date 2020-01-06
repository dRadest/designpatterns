package com.dradest.designpatterns.decoratorpattern.decorator;

import com.dradest.designpatterns.decoratorpattern.product.Product;

public class CaramelSauce extends CondimentDecorator {
    private Product product;

    public CaramelSauce(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Caramel Sauce";
    }

    @Override
    public Double cost() {
        return product.cost() + 1.34;
    }
}
