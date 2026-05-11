package com.designpattern.factorymethod;


public class StandardBurger implements Burger {

  @Override
  public void prepare() {
    System.out.println("Preparing Standard Burger");
  }
}
