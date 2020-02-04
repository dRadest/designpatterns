package com.dradest.designpatterns.iteratorpattern.shirt;

public class Shirt {
    private Size size;
    private String type;

    public Shirt(Size size, String type) {
        this.size = size;
        this.type = type;
    }

    public Size getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
}
