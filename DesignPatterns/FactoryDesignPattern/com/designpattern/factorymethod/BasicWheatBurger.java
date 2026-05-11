package com.designpattern.factorymethod;

public class BasicWheatBurger implements Burger{

  @Override
  public void prepare() {
    System.out.println("Preparing Basic Wheat Burger");
  }
}
