package com.dradest.designpatterns.strategy.characters;

import com.dradest.designpatterns.strategy.abilities.GubraithianFire;
import com.dradest.designpatterns.strategy.spell.ForcefulSpell;

public class Dumbledore extends Wizard {

    public Dumbledore() {
        this.spellCast = new ForcefulSpell();
        this.specialAbility = new GubraithianFire();
    }

    @Override
    public void display() {
        System.out.println("I am Albus Dumbledore");
    }

}
