package com.designpattern.strategydesign;

public class CompanionRobot extends Robot{

  public CompanionRobot(Talkable t, Walkable w, Flyable f) {
    super(t, w, f);
  }

  public void projection() {
    System.out.println("Displaying robot...");
  }
}
