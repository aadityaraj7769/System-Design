package com.designpattern.simplefactory;

public class BurgerFactory {
  private Burger burger;

  public Burger createBurger(String type) {
    if(type.equals("basic")) {
      burger = new BasicBurger();
    }
    else if(type.equals("standard")) {
      burger = new StandardBurger();
    }
    else {
      burger = new PremiumBurger();
    }

    return burger;
  }
}
