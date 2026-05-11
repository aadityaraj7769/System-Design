package com.designpattern.abstractfactory.garlicbread;

public class BasicGarlicBread implements GarlicBread{

  @Override
  public void prepare() {
    System.out.println("Preparing Basic Garlic Bread");
  }
}
