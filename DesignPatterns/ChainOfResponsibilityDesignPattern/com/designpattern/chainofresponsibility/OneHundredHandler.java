package com.designpattern.chainofresponsibility;

public class OneHundredHandler extends MoneyHandler {
  private int numNotes;

  public OneHundredHandler(int numNotes) {
    this.numNotes = numNotes;
  }

  @Override
  public void dispense(int amount) {
    int notesNeeded = amount / 100;

    if(notesNeeded > numNotes) {
      notesNeeded = numNotes;
      numNotes = 0;
    }
    else {
      numNotes -= notesNeeded;
    }

    if(numNotes >= 0) {
      System.out.println("Dispensing " + notesNeeded + " x $100 notes");
    }

    int remAmount = amount - notesNeeded * 100;

    if(remAmount > 0) {
      if(nextHandler != null) {
        nextHandler.dispense(remAmount);
      }else {
        System.out.println("No more notes left");
      }
    }
  }
}
