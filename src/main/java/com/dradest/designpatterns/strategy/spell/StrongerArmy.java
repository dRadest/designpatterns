package com.dradest.designpatterns.strategy.spell;

public class StrongerArmy implements SpellCast {

    @Override
    public void castASpell() {
        System.out.println("Spell: Make an army 10x stronger");
    }

}
