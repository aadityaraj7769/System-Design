package com.designpattern.simplefactory;

public class PremiumBurger implements Burger {

  @Override
  public void prepare() {
    System.out.println("Prepare Premium Burger");
  }
}
