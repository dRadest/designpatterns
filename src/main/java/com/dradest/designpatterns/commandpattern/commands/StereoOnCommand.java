package com.dradest.designpatterns.commandpattern.commands;

import com.dradest.designpatterns.commandpattern.devices.Stereo;

public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setPlaylist();
        stereo.setVolume(7);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
