package com.designpattern.simplefactory;

public class SimpleFactory {
  public static void main(String[] args) {

    BurgerFactory bFactory = new BurgerFactory();

    Burger bBurger = bFactory.createBurger("basic");
    bBurger.prepare();
    Burger sBurger = bFactory.createBurger("standard");
    sBurger.prepare();
  }
}
