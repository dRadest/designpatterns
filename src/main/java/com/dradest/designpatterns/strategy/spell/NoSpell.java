package com.dradest.designpatterns.strategy.spell;

public class NoSpell implements SpellCast {

    @Override
    public void castASpell() {
        System.out.println("Spell: void");
    }

}
