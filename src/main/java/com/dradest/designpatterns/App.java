package com.dradest.designpatterns;

import com.dradest.designpatterns.observerpattern.ObserverLibrary;
import com.dradest.designpatterns.strategy.StrategyWizards;

/**
 * Place to showcase the design patterns
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // strategy pattern
//        StrategyWizards strategyWizards = new StrategyWizards();
//        strategyWizards.showStrategyMagic();

        // observer pattern
        ObserverLibrary observerLibrary = new ObserverLibrary();
        observerLibrary.showObserverLibrary();



    }

}
