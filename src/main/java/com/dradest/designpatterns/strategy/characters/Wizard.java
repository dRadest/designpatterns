package com.dradest.designpatterns.strategy.characters;

import com.dradest.designpatterns.strategy.abilities.SpecialAbility;
import com.dradest.designpatterns.strategy.spell.SpellCast;

public abstract class Wizard {
    protected SpellCast spellCast;
    protected SpecialAbility specialAbility;

    public abstract void display();

    public void performSpellCast(){
        spellCast.castASpell();
    }

    public void doSomethingSpecial(){
        specialAbility.perform();
    }

    public void setSpellCast(SpellCast spellCast) {
        this.spellCast = spellCast;
    }

    public void setSpecialAbility(SpecialAbility specialAbility) {
        this.specialAbility = specialAbility;
    }
}
