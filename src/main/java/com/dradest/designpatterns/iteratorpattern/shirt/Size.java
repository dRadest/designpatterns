package com.dradest.designpatterns.iteratorpattern.shirt;

public enum Size {
    SIZE_S,
    SIZE_M,
    SIZE_L,
    SIZE_X;

    @Override
    public String toString() {
        switch (this){
            case SIZE_S:
                return "S";
            case SIZE_X:
                return "X";
            case SIZE_L:
                return "L";
            case SIZE_M:
                return "M";
            default:
                return "unknown";
        }
    }
}
