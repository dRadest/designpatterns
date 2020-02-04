package com.dradest.designpatterns.templatemethod;

import com.dradest.designpatterns.templatemethod.chocolate.*;

public class ChocolateTemplateFactory {

    public void makeChocolates(){

        System.out.println("Make milk chocolate");
        Chocolate milkChocolate = new MilkChocolate();
        milkChocolate.makeChocolate();

        System.out.println("\nMake Caramel chocolate");
        Chocolate caramelChocolate = new CaramelChocolate();
        caramelChocolate.makeChocolate();

        System.out.println("\nMake Hazelnut chocolate");
        Chocolate hazelnutChcolate = new HazelnutChocolate();
        hazelnutChcolate.makeChocolate();

        System.out.println("\nMake Cookies chocolate");
        Chocolate cookiesChocolate = new CookiesChocolate();
        cookiesChocolate.makeChocolate();

        System.out.println("\nMake Strawberry chocolate");
        Chocolate strawberryChocolate = new StrawberryChocolate();
        strawberryChocolate.makeChocolate();
    }
}
