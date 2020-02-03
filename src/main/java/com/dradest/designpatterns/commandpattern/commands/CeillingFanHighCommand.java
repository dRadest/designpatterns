package com.dradest.designpatterns.commandpattern.commands;

import com.dradest.designpatterns.commandpattern.devices.CeillingFan;

public class CeillingFanHighCommand implements Command {
    CeillingFan ceillingFan;
    int previousSpeed;

    public CeillingFanHighCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        this.previousSpeed = ceillingFan.getSpeed();
        ceillingFan.high();
    }

    @Override
    public void undo() {
        switch (previousSpeed){
            case CeillingFan.OFF:
                ceillingFan.off();
                break;
            case CeillingFan.LOW:
                ceillingFan.low();
                break;
            case CeillingFan.MEDIUM:
                ceillingFan.medium();
                break;
            case CeillingFan.HIGH:
                ceillingFan.high();
                break;
        }
    }
}
