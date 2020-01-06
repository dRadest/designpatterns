package com.dradest.designpatterns.decoratorpattern.product;

public class FrozenYogurt extends Product {
    public FrozenYogurt() {
        description = "Frozen Yogurt";
    }

    @Override
    public Double cost() {
        return 2.49;
    }
}
