package com.dradest.designpatterns.strategy;

import com.dradest.designpatterns.strategy.characters.Damdote;
import com.dradest.designpatterns.strategy.characters.Ganji;
import com.dradest.designpatterns.strategy.characters.Zod;
import com.dradest.designpatterns.strategy.characters.Wizard;
import com.dradest.designpatterns.strategy.spell.StrongerArmy;

public class StrategyWizards {

    public void showStrategyMagic(){
        System.out.println("Strategy design pattern\n");
        Wizard wizardDumbledore = new Damdote();
        wizardDumbledore.display();
        wizardDumbledore.performSpellCast();
        wizardDumbledore.doSomethingSpecial();

        System.out.println();

        Wizard wizardGandalf = new Ganji();
        wizardGandalf.display();
        wizardGandalf.performSpellCast();
        wizardGandalf.doSomethingSpecial();

        System.out.println("Change the spell Ganji casts at runtime");
        wizardGandalf.setSpellCast(new StrongerArmy());
        wizardGandalf.performSpellCast();

        System.out.println();

        Wizard wizardOfOz = new Zod();
        wizardOfOz.display();
        wizardOfOz.performSpellCast();
        wizardOfOz.doSomethingSpecial();

        System.out.println();
    }

}
