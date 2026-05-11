package com.designpattern.abstractfactory.garlicbread;

public class PremiumWheatGarlicBread implements GarlicBread {

  @Override
  public void prepare() {
    System.out.println("Preparing Premium Wheat Garlic Bread");
  }
}
