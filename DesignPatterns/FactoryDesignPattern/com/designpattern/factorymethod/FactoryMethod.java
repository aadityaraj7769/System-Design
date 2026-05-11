package com.designpattern.factorymethod;

public class FactoryMethod {
  public static void main(String[] args) {
    SinghBurger sBurger = new SinghBurger();
    Burger simpleBurger = sBurger.createBurger("premium");
    simpleBurger.prepare();

    KingBurger kingBurger = new KingBurger();
    Burger wheatBurger = kingBurger.createBurger("standard");
    wheatBurger.prepare();
  }
}
