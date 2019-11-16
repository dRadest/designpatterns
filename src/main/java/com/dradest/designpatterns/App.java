package com.dradest.designpatterns;

import com.dradest.designpatterns.strategy.StrategyWizards;
import com.dradest.designpatterns.strategy.characters.Dumbledore;
import com.dradest.designpatterns.strategy.characters.Gandalf;
import com.dradest.designpatterns.strategy.characters.Oz;
import com.dradest.designpatterns.strategy.characters.Wizard;
import com.dradest.designpatterns.strategy.spell.StrongerArmy;

/**
 * Place to showcase the design patterns
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // strategy pattern
        StrategyWizards strategyWizards = new StrategyWizards();
        strategyWizards.showStrategyMagic();

    }

}
