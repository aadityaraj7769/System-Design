package com.designpattern.strategydesign;

public class NormalFly implements Flyable{

  @Override
  public void fly() {
    System.out.println("Robots Fly");
  }
}
