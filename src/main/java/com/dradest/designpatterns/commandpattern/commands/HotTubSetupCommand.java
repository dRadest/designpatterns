package com.dradest.designpatterns.commandpattern.commands;

import com.dradest.designpatterns.commandpattern.devices.HotTub;

public class HotTubSetupCommand implements Command {
    HotTub hotTub;

    public HotTubSetupCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.setup();
    }

    @Override
    public void undo() {
        hotTub.cleanUp();
    }
}
