package com.designpattern.bridge;

public class SUV implements CarType {
  private Engine _engine;

  public SUV(Engine engine) {
    _engine = engine;
  }

  @Override
  public void drive() {
    _engine.start();
    System.out.println("SUV is running");
  }
}
