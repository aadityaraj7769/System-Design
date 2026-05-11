package com.designpattern.strategydesign;

public class NoWalk implements Walkable{

  @Override
  public void walk() {
    System.out.println("Robot don't walk");
  }
}
