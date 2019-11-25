package com.dradest.designpatterns.decoratorpattern.decorator;

import com.dradest.designpatterns.decoratorpattern.product.Product;

public class SliveredAlmonds extends CondimentDecorator {
    Product product;

    public SliveredAlmonds(Product product) {
        this.product = product;
    }

    @Override
    public String getDescription() {
        return product.getDescription() + ", Slivered Almonds";
    }

    @Override
    public Double cost() {
        return product.cost() + 1.09;
    }
}
