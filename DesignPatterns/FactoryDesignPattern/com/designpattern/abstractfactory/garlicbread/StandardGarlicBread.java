package com.designpattern.abstractfactory.garlicbread;


public class StandardGarlicBread implements GarlicBread {

  @Override
  public void prepare() {
    System.out.println("Preparing Standard Garlic Bread");
  }
}
