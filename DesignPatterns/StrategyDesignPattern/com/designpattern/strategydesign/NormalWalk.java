package com.designpattern.strategydesign;

public class NormalWalk implements Walkable{

  @Override
  public void walk() {
    System.out.println("Robot walks");
  }
}
