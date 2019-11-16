package com.dradest.designpatterns.strategy.abilities;

public class NoPass implements SpecialAbility {

    @Override
    public void perform() {
        System.out.println("Special Ability: Stopping Balrog of Morgoth from passing");
    }

}
