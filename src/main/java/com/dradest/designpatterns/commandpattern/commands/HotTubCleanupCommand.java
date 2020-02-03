package com.dradest.designpatterns.commandpattern.commands;

import com.dradest.designpatterns.commandpattern.devices.HotTub;

public class HotTubCleanupCommand implements Command {
    HotTub hotTub;

    public HotTubCleanupCommand(HotTub hotTub) {
        this.hotTub = hotTub;
    }

    @Override
    public void execute() {
        hotTub.cleanUp();
    }

    @Override
    public void undo() {
        hotTub.setup();
    }
}
