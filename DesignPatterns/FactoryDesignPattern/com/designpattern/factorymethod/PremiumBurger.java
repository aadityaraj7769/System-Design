package com.designpattern.factorymethod;


public class PremiumBurger implements Burger {

  @Override
  public void prepare() {
    System.out.println("Prepare Premium Burger");
  }
}
