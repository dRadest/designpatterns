package com.dradest.designpatterns.decoratorpattern;

import com.dradest.designpatterns.decoratorpattern.decorator.CaramelSauce;
import com.dradest.designpatterns.decoratorpattern.decorator.ChocolateSprinkles;
import com.dradest.designpatterns.decoratorpattern.decorator.CookieCrumbs;
import com.dradest.designpatterns.decoratorpattern.product.FrozenYogurt;
import com.dradest.designpatterns.decoratorpattern.product.Product;

public class DecoratorParlor {

    public void orderFrozenYogurts(){
        Product firstFrozenYogurt = new FrozenYogurt();
        System.out.println(firstFrozenYogurt.getDescription() + " cost: " + firstFrozenYogurt.cost() + " €");

        Product secondFrozenYogurt = new FrozenYogurt();
        secondFrozenYogurt = new CookieCrumbs(secondFrozenYogurt);
        System.out.println(secondFrozenYogurt.getDescription() + " cost: " + secondFrozenYogurt.cost() + " €");

        Product thirdFrozenYogurt = new FrozenYogurt();
        thirdFrozenYogurt = new CaramelSauce(thirdFrozenYogurt);
        thirdFrozenYogurt = new ChocolateSprinkles(thirdFrozenYogurt);
        System.out.println(thirdFrozenYogurt.getDescription() + " cost: " + thirdFrozenYogurt.cost() + " €");
    }
}
