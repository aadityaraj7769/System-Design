package com.designpattern.factorymethod;

public class PremiumWheatBurger implements Burger {

  @Override
  public void prepare() {
    System.out.println("Preparing Premium Wheat Burger");
  }
}
