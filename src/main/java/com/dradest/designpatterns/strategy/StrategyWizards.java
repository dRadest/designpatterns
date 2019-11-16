package com.dradest.designpatterns.strategy;

import com.dradest.designpatterns.strategy.characters.Dumbledore;
import com.dradest.designpatterns.strategy.characters.Gandalf;
import com.dradest.designpatterns.strategy.characters.Oz;
import com.dradest.designpatterns.strategy.characters.Wizard;
import com.dradest.designpatterns.strategy.spell.StrongerArmy;

public class StrategyWizards {

    public void showStrategyMagic(){
        System.out.println("Strategy design pattern\n");
        Wizard wizardDumbledore = new Dumbledore();
        wizardDumbledore.display();
        wizardDumbledore.performSpellCast();
        wizardDumbledore.doSomethingSpecial();

        System.out.println();

        Wizard wizardGandalf = new Gandalf();
        wizardGandalf.display();
        wizardGandalf.performSpellCast();
        wizardGandalf.doSomethingSpecial();

        System.out.println("Change the spell Gandalf casts at runtime");
        wizardGandalf.setSpellCast(new StrongerArmy());
        wizardGandalf.performSpellCast();

        System.out.println();

        Wizard wizardOfOz = new Oz();
        wizardOfOz.display();
        wizardOfOz.performSpellCast();
        wizardOfOz.doSomethingSpecial();

        System.out.println();
    }

}
