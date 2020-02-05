package com.dradest.designpatterns.statepattern;

import com.dradest.designpatterns.statepattern.tv.TVBox;

public class WatchingTVState {

    public void watchTV(){
        TVBox tvBox = new TVBox();

        System.out.println(tvBox);

        tvBox.channelUp();
        tvBox.turnOn();
        System.out.println(tvBox);
        tvBox.channelUp();
        tvBox.mute();
        System.out.println(tvBox);
        tvBox.mute();
        tvBox.soundOn();
        tvBox.turnOn();
        System.out.println(tvBox);
        tvBox.channelDown();
        tvBox.channelDown();
        tvBox.channelUp();
        tvBox.channelUp();
        tvBox.channelUp();
        tvBox.channelUp();
        tvBox.channelDown();


    }
}
