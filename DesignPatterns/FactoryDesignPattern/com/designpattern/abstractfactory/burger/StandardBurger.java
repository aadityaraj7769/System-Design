package com.designpattern.abstractfactory.burger;


public class StandardBurger implements Burger {

  @Override
  public void prepare() {
    System.out.println("Preparing Standard Burger");
  }
}
