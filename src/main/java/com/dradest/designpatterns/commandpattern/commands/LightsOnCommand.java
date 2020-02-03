package com.dradest.designpatterns.commandpattern.commands;

import com.dradest.designpatterns.commandpattern.devices.Lights;

public class LightsOnCommand implements Command {
    Lights lights;

    public LightsOnCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.on();
    }

    @Override
    public void undo() {
        lights.off();
    }
}
