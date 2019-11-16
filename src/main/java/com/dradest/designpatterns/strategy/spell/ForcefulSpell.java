package com.dradest.designpatterns.strategy.spell;

public class ForcefulSpell implements SpellCast {

    @Override
    public void castASpell() {
        System.out.println("Spell: Forceful spell");
    }

}
