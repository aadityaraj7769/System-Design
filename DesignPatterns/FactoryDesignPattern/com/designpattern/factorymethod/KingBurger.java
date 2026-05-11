package com.designpattern.factorymethod;

public class KingBurger implements BurgerFactory{
  private Burger burger;

  public Burger createBurger(String type) {
    if(type.equals("basic")) {
      burger = new BasicWheatBurger();
    }
    else if(type.equals("standard")) {
      burger = new StandardWheatBurger();
    }
    else if(type.equals("premium")) {
      burger = new PremiumWheatBurger();
    }
    else {
      System.out.println("Burger type not recognized");
    }

    return burger;
  }
}
