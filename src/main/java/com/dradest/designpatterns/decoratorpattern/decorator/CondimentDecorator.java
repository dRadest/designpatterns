package com.dradest.designpatterns.decoratorpattern.decorator;

import com.dradest.designpatterns.decoratorpattern.product.Product;

public abstract class CondimentDecorator extends Product {
    public abstract String getDescription();
}
