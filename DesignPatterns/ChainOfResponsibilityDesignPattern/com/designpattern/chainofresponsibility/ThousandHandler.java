package com.designpattern.chainofresponsibility;

public class ThousandHandler extends MoneyHandler {

  private int numNotes;

  public ThousandHandler(int numNotes) {
    this.numNotes = numNotes;
  }

  @Override
  public void dispense(int amount) {
    int notesNeeded = amount / 1000;

    if(notesNeeded > numNotes) {
      notesNeeded = numNotes;
      numNotes = 0;
    }
    else {
      numNotes -= notesNeeded;
    }

    if(numNotes >= 0) {
      System.out.println("Dispensing " + notesNeeded + " x $1000 notes");
    }

    int remAmount = amount - notesNeeded * 1000;

    if(remAmount > 0) {
      if(nextHandler != null) {
        nextHandler.dispense(remAmount);
      }else {
        System.out.println("No more notes left");
      }
    }
  }
}
