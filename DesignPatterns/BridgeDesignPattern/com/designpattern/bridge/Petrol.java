package com.designpattern.bridge;

public class Petrol implements Engine {
  @Override
  public void start() {
    System.out.println("Petrol Engine started");
  }
}
