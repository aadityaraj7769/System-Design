package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.burger.*;
import com.designpattern.abstractfactory.garlicbread.*;

public class SinghBurger implements BurgerFactory {
  private Burger burger;
  private GarlicBread garlicBread;

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
      return null;
    }

    return burger;
  }

  public GarlicBread createGarlicBread(String type) {
    if(type.equals("basic")) {
      garlicBread = new BasicGarlicBread();
    }
    else if(type.equals("standard")) {
      garlicBread = new StandardGarlicBread();
    }
    else if(type.equals("premium")) {
      garlicBread = new PremiumGarlicBread();
    }
    else {
      System.out.println("GarlicBread type not recognized");
      return null;
    }
    return garlicBread;
  }
}
