package com.dradest.designpatterns.commandpattern.remotecontrol;

import com.dradest.designpatterns.commandpattern.commands.Command;
import com.dradest.designpatterns.commandpattern.commands.NoCommand;

public class RemoteControl {
    private static final int TOTAL_SLOTS = 8;
    private Command onCommands[];
    private Command offCommands[];
    private Command undocommand;


    public RemoteControl() {
        onCommands = new Command[TOTAL_SLOTS];
        offCommands = new Command[TOTAL_SLOTS];

        Command noCommand = new NoCommand();
        for (int i=0; i < TOTAL_SLOTS; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undocommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        if (slot < TOTAL_SLOTS && slot >= 0){
            onCommands[slot] = onCommand;
            offCommands[slot] = offCommand;
        }
    }

    public void onButtonClicked(int slot){
        if (slot < TOTAL_SLOTS && slot >= 0){
            onCommands[slot].execute();
            undocommand = onCommands[slot];
        }else {
            System.out.println("No such slot (" + slot + ")");
        }
    }

    public void offButtonClicked(int slot){
        if (slot < TOTAL_SLOTS && slot >= 0){
            offCommands[slot].execute();
            undocommand = offCommands[slot];
        }else {
            System.out.println("No such slot (" + slot + ")");
        }
    }

    public void undoButtonClicked(){
        undocommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("================== RemoteControl ==================\n");
        for (int i=0; i<TOTAL_SLOTS; i++){
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "          " + offCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }
}
