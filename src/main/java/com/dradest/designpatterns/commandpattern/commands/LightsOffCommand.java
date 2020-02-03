package com.dradest.designpatterns.commandpattern.commands;

import com.dradest.designpatterns.commandpattern.devices.Lights;

public class LightsOffCommand implements Command {
    Lights lights;

    public LightsOffCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.off();
    }

    @Override
    public void undo() {
        lights.on();
    }
}
