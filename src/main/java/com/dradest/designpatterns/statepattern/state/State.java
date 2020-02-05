package com.dradest.designpatterns.statepattern.state;

public interface State {
    void turnOn();
    void turnOff();
    void mute();
    void soundOn();
    void channelUp();
    void channelDown();
}
