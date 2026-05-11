package com.designpattern.command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class RemoteControl {

  private static final int numButtons = 4;

  private ICommand[] button;
  private boolean[] buttonPressed;

  public RemoteControl() {
    button = new ICommand[numButtons];
    buttonPressed = new boolean[numButtons];

    for(int i = 0; i < numButtons; i++) {
      button[i] = null;
      buttonPressed[i] = false;
    }
  }


  void setCommands(ICommand command, int pos) {
    if(pos >= 0 && pos < button.length) {
      button[pos] = command;
      buttonPressed[pos] = false;
    }
  }

  void pressButton(int pos) {
    if(pos >= 0 && pos < button.length && button[pos] != null) {
      if(!buttonPressed[pos]) {
        button[pos].execute();
      }else {
        button[pos].undo();
      }
      buttonPressed[pos] = !buttonPressed[pos];
    }
  }


}
