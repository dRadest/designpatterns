package com.dradest.designpatterns.statepattern.tv;

import com.dradest.designpatterns.statepattern.state.*;

public class TVBox {
    private State onState;
    private State offState;
    private State muteState;
    private State soundState;

    private State state;

    private int currentChannel;

    public TVBox() {
        this.onState = new OnState(this);
        this.offState = new OffState(this);
        this.muteState = new MuteState(this);
        this.soundState = new SoundState(this);
        // initial state of TV
        this.state = offState;
        this.currentChannel = 1;
    }

    public void turnOn(){
        state.turnOn();
    }

    public void turnOff(){
        state.turnOff();
    }

    public void mute(){
        state.mute();
    }

    public void soundOn(){
        state.soundOn();
    }

    public void channelUp(){
        state.channelUp();
    }

    public void channelDown(){
        state.channelDown();
    }

    // getters and setters
    public State getOnState() {
        return onState;
    }

    public State getOffState() {
        return offState;
    }

    public State getMuteState() {
        return muteState;
    }

    public State getSoundState() {
        return soundState;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Current state of the tv: ");
        if (state == onState){
            sb.append("ON");
        }else if (state == offState){
            sb.append("OFF");
        }else if (state == muteState){
            sb.append("MUTE");
        }else if (state == soundState){
            sb.append("SOUND");
        }else {
            sb.append("UNKNOWN");
        }
        return sb.toString();
    }
}
