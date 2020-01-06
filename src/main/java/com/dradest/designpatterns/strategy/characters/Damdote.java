package com.dradest.designpatterns.strategy.characters;

import com.dradest.designpatterns.strategy.abilities.GrubatFire;
import com.dradest.designpatterns.strategy.spell.ForcefulSpell;

public class Damdote extends Wizard {
    public Damdote() {
        this.spellCast = new ForcefulSpell();
        this.specialAbility = new GrubatFire();
    }

    @Override
    public void display() {
        System.out.println("I am Damdote");
    }
}
