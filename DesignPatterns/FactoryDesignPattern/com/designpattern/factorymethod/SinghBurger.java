package com.designpattern.factorymethod;


public class SinghBurger implements BurgerFactory {
  private Burger burger;

  public Burger createBurger(String type) {
    if(type.equals("basic")) {
      burger = new BasicBurger();
    }
    else if(type.equals("standard")) {
      burger = new StandardBurger();
    }
    else if(type.equals("premium")) {
      burger = new PremiumBurger();
    }
    else {
      System.out.println("Burger type not recognized");
    }

    return burger;
  }
}
