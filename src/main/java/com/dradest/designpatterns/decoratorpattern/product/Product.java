package com.dradest.designpatterns.decoratorpattern.product;

public abstract class Product {
    String description = "Unknown product.";

    public String getDescription(){
        return description;
    }

    public abstract Double cost();
}
