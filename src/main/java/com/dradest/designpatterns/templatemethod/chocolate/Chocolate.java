package com.dradest.designpatterns.templatemethod.chocolate;

public abstract class Chocolate {

    public void makeChocolate(){
        roastBeans();
        refineCocoa();
        conchChocolate();
        temperChocolate();
        addition();
    }

    private void roastBeans() {
        System.out.println("Roasting beans");
    }

    private void refineCocoa() {
        System.out.println("Refining cocoa");
    }

    private void conchChocolate(){
        System.out.println("Conching chocolate");
    }

    private void temperChocolate(){
        System.out.println("Tempering chocolate");
    }

    abstract void addition();
}
