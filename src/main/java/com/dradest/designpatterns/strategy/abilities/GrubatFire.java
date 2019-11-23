package com.dradest.designpatterns.strategy.abilities;

public class GrubatFire implements SpecialAbility {

    @Override
    public void perform() {
        System.out.println("Special Ability: Conjure Gubraithian Fire");
    }

}
