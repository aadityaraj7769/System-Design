package com.designpattern.command;

public class CommandPattern {
  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    remoteControl.setCommands(new LightCommand(new Light()), 0);
    remoteControl.setCommands(new FanCommand(new Fan()), 1);

    remoteControl.pressButton(0);
    remoteControl.pressButton(1);
    remoteControl.pressButton(1);
    remoteControl.pressButton(0);
  }
}
