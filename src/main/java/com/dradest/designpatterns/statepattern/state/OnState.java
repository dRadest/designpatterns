package com.dradest.designpatterns.statepattern.state;

import com.dradest.designpatterns.statepattern.tv.TVBox;

public class OnState implements State {
    private TVBox tvBox;

    public OnState(TVBox tvBox) {
        this.tvBox = tvBox;
    }

    @Override
    public void turnOn() {
        System.out.println("TV already on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV off");
        tvBox.setState(tvBox.getOffState());
    }

    @Override
    public void mute() {
        System.out.println("TV mute");
        tvBox.setState(tvBox.getMuteState());
    }

    @Override
    public void soundOn() {
        System.out.println("TV sound on");
        tvBox.setState(tvBox.getSoundState());

    }

    @Override
    public void channelUp() {
        int currentChannel = tvBox.getCurrentChannel();
        currentChannel++;
        tvBox.setCurrentChannel(currentChannel);
        System.out.println("TV channel up to: " + currentChannel);
    }

    @Override
    public void channelDown() {
        int currentChannel = tvBox.getCurrentChannel();
        if (currentChannel > 1){
            currentChannel--;
            tvBox.setCurrentChannel(currentChannel);
            System.out.println("TV channel down to: " + currentChannel);
        }else {
            System.out.println("Cannot channel down below 1");
        }
    }
}
