package com.dradest.designpatterns.strategy.characters;

import com.dradest.designpatterns.strategy.abilities.NoPass;
import com.dradest.designpatterns.strategy.spell.BrightFlash;

public class Gandalf extends Wizard {

    public Gandalf() {
        this.specialAbility = new NoPass();
        this.spellCast = new BrightFlash();
    }

    @Override
    public void display() {
        System.out.println(("I am Gandalf"));
    }

}
