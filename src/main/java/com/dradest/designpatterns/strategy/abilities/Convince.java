package com.dradest.designpatterns.strategy.abilities;

public class Convince implements SpecialAbility {

    @Override
    public void perform() {
        System.out.println("Special Ability: Convince people");
    }

}
