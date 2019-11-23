package com.dradest.designpatterns.strategy.characters;

import com.dradest.designpatterns.strategy.abilities.Convince;
import com.dradest.designpatterns.strategy.spell.NoSpell;

public class Zod extends Wizard {

    public Zod() {
        this.specialAbility = new Convince();
        this.spellCast = new NoSpell();
    }

    @Override
    public void display() {
        System.out.println("I am Wizard of Zod");
    }

}
