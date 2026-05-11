package com.designpattern.abstractfactory.garlicbread;


public class PremiumGarlicBread implements GarlicBread {

  @Override
  public void prepare() {
    System.out.println("Prepare Premium Garlic Bread");
  }
}
