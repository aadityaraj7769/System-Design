package com.designpattern.bridge;

public class Electric implements Engine {
  @Override
  public void start() {
    System.out.println("Electric Engine started");
  }
}
