package com.designpattern.strategydesign;

public class NoFly implements Flyable{

  @Override
  public void fly() {
    System.out.println("Robots NoFly");
  }
}
