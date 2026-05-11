package com.designpattern.abstractfactory.garlicbread;

public class StandardWheatGarlicBread implements GarlicBread {

  @Override
  public void prepare() {
    System.out.println("Preparing Standard Wheat Garlic Bread");
  }
}
