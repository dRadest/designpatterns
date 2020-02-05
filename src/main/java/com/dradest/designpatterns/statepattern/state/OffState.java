package com.dradest.designpatterns.statepattern.state;

import com.dradest.designpatterns.statepattern.tv.TVBox;

public class OffState implements State {
    private TVBox tvBox;

    public OffState(TVBox tvBox) {
        this.tvBox = tvBox;
    }

    @Override
    public void turnOn() {
        System.out.println("TV on");
        tvBox.setState(tvBox.getOnState());
    }

    @Override
    public void turnOff() {
        System.out.println("TV already off");
    }

    @Override
    public void mute() {
        System.out.println("TV off. Cannot operate");
    }

    @Override
    public void soundOn() {
        System.out.println("TV off. Cannot operate");
    }

    @Override
    public void channelUp() {
        System.out.println("TV off. Cannot operate");
    }

    @Override
    public void channelDown() {
        System.out.println("TV off. Cannot operate");
    }
}
