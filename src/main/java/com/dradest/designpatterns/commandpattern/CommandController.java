package com.dradest.designpatterns.commandpattern;

import com.dradest.designpatterns.commandpattern.commands.*;
import com.dradest.designpatterns.commandpattern.devices.*;
import com.dradest.designpatterns.commandpattern.remotecontrol.RemoteControl;

public class CommandController {

    public void loadCommands(){
        RemoteControl remoteControl = new RemoteControl();

        // prepare devices
        Lights livingRoomLights = new Lights("Living room");
        Lights kitchenLights = new Lights("Kitchen");
        CeillingFan ceillingFan = new CeillingFan("Living room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        // prepare commands
        LightsOnCommand livingRoomLightsOnCommand = new LightsOnCommand(livingRoomLights);
        LightsOffCommand livingRoomLightsOffCommand = new LightsOffCommand(livingRoomLights);
        LightsOnCommand kitchenLightsOnCommand = new LightsOnCommand(kitchenLights);
        LightsOffCommand kitchenLightsOffCommand = new LightsOffCommand(kitchenLights);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        CeillingFanLowCommand ceilingFanLowCommand = new CeillingFanLowCommand(ceillingFan);
        CeillingFanMediumCommand ceillingFanMediumCommand = new CeillingFanMediumCommand(ceillingFan);
        CeillingFanHighCommand ceillingFanHighCommand = new CeillingFanHighCommand(ceillingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceillingFan);


        // set commands
        remoteControl.setCommand(0, livingRoomLightsOnCommand, livingRoomLightsOffCommand);
        remoteControl.setCommand(1, kitchenLightsOnCommand, kitchenLightsOffCommand);
        remoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);
        remoteControl.setCommand(3, stereoOnCommand, stereoOffCommand);
        remoteControl.setCommand(4, ceilingFanLowCommand, ceilingFanOffCommand);
        remoteControl.setCommand(5, ceillingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(6, ceillingFanHighCommand, ceilingFanOffCommand);

        // set macro command
        HotTub hotTub = new HotTub();
        HotTubSetupCommand hotTubSetupCommand = new HotTubSetupCommand(hotTub);
        HotTubCleanupCommand hotTubCleanupCommand = new HotTubCleanupCommand(hotTub);
        Command[] afterALongDayOnCommands = {livingRoomLightsOnCommand, hotTubSetupCommand, stereoOnCommand};
        Command[] afterALongDayOffCommands = {livingRoomLightsOffCommand, hotTubCleanupCommand, stereoOffCommand};
        MacroCommand afterALongDayOnMacro = new MacroCommand(afterALongDayOnCommands);
        MacroCommand afterALongDayOffMacro = new MacroCommand(afterALongDayOffCommands);
        remoteControl.setCommand(7, afterALongDayOnMacro, afterALongDayOffMacro);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonClicked(0);
        remoteControl.offButtonClicked(0);
        remoteControl.onButtonClicked(1);
        remoteControl.offButtonClicked(1);
        System.out.println("undo button clicked");
        remoteControl.undoButtonClicked();
        remoteControl.onButtonClicked(2);
        remoteControl.offButtonClicked(2);
        remoteControl.onButtonClicked(3);
        remoteControl.offButtonClicked(3);
        System.out.println("Testing our ceilling fan");
        remoteControl.onButtonClicked(4);
        System.out.println("undo button clicked");
        remoteControl.undoButtonClicked();
        remoteControl.offButtonClicked(4);
        remoteControl.onButtonClicked(5);
        remoteControl.offButtonClicked(5);
        System.out.println("undo button clicked");
        remoteControl.undoButtonClicked();
        remoteControl.onButtonClicked(6);
        System.out.println("undo button clicked");
        remoteControl.undoButtonClicked();
        remoteControl.offButtonClicked(6);
        System.out.println("Testing our MacroCommand");
        remoteControl.onButtonClicked(7);
        remoteControl.offButtonClicked(7);
        remoteControl.onButtonClicked(8);
        remoteControl.offButtonClicked(8);

    }
}
