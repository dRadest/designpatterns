package com.dradest.designpatterns.commandpattern.commands;

import com.dradest.designpatterns.commandpattern.devices.CeillingFan;

public class CeillingFanLowCommand implements Command {
    CeillingFan ceillingFan;
    int previousSpeed;

    public CeillingFanLowCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceillingFan.getSpeed();
        ceillingFan.low();
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
