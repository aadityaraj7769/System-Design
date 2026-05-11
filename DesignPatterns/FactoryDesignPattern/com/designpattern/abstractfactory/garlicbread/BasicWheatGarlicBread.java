package com.designpattern.abstractfactory.garlicbread;

public class BasicWheatGarlicBread implements GarlicBread{

  @Override
  public void prepare() {
    System.out.println("Preparing BasicWheatGarlicBread");
  }
}
