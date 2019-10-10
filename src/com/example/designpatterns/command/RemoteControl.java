package com.example.designpatterns.command;

/*
* invoker: used to set commands
* */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[2];
        this.offCommands = new Command[2];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 2; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommands(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- Remote Control --------\n");

        for (int i = 0; i < onCommands.length; i++)
            sb.append("slot: " + i + ", " + onCommands[i].getClass().getName() +
                    "   " + offCommands.getClass().getName() + "\n");

        return sb.toString();
    }
}
