package com.designpattern.bridge;

public class Sedan implements CarType {
  private Engine _engine;

  public Sedan(Engine engine) {
    _engine = engine;
  }

  @Override
  public void drive() {
    _engine.start();
    System.out.println("Sedan drive");
  }
}
