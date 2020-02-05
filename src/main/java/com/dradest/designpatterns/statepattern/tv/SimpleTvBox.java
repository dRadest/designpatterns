package com.dradest.designpatterns.statepattern.tv;

public class SimpleTvBox {

    // states
    private final static int OFF = 0;
    private final static int ON = 1;
    private final static int SOUND = 2;
    private final static int MUTE = 4;

    private int state = OFF;
    private int currentChannel;

    public SimpleTvBox() {
        currentChannel = 1;
    }

    // actions
    public void turnOn(){
        if (state == OFF){
            System.out.println("Tv turned on");
        }
        if (state == ON){
            System.out.println("Tv already on");
        }
        if (state == SOUND){
            System.out.println("Tv already on");
        }
        if (state == MUTE){
            System.out.println("Tv already on");
        }
    }

    public void turnOff(){
        if (state == OFF){
            System.out.println("Tv already off");
        }
        if (state == ON){
            System.out.println("Tv turned off");
        }
        if (state == SOUND){
            System.out.println("Tv off. Can't operate");
        }
        if (state == MUTE){
            System.out.println("Tv off. Can't operate");
        }
    }

    public void soundOn(){
        if (state == OFF){
            System.out.println("Tv off. Can't operate");
        }
        if (state == ON){
            System.out.println("Sound on");
        }
        if (state == SOUND){
            System.out.println("Sound already on");
        }
        if (state == MUTE){
            System.out.println("Sound on");
        }
    }

    public void mute(){
        if (state == OFF){
            System.out.println("Tv off. Can't operate");
        }
        if (state == ON){
            System.out.println("Tv mute");
        }
        if (state == SOUND){
            System.out.println("Tv mute");
        }
        if (state == MUTE){
            System.out.println("Tv already mute");
        }
    }

    public void channelUp(){
        if (state == OFF){
            System.out.println("Tv off. Can't operate");
        }else {
            currentChannel++;
            System.out.println("Channel switched to: " + currentChannel);
        }
    }

    public void channelDown(){
        if (state == OFF){
            System.out.println("Tv off. Can't operate");
        }else {
            if (currentChannel > 1){
                currentChannel--;
                System.out.println("Channel switched to: " + currentChannel);
            }else {
                System.out.println("Channel cannot go below 1");
            }
        }
    }
}
