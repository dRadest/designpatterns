package com.dradest.designpatterns.strategy.spell;

public class BrightFlash implements SpellCast {

    @Override
    public void castASpell() {
        System.out.println("Spell: Bright flash of light");
    }

}
