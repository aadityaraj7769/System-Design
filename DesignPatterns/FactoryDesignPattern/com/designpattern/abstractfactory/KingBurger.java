package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.burger.*;
import com.designpattern.abstractfactory.garlicbread.BasicWheatGarlicBread;
import com.designpattern.abstractfactory.garlicbread.GarlicBread;
import com.designpattern.abstractfactory.garlicbread.PremiumWheatGarlicBread;
import com.designpattern.abstractfactory.garlicbread.StandardWheatGarlicBread;


public class KingBurger implements BurgerFactory{
  private Burger burger;
  private GarlicBread garlicBread;

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
      return null;
    }

    return burger;
  }

  public GarlicBread createGarlicBread(String type) {
    if(type.equals("basic")) {
      garlicBread = new BasicWheatGarlicBread();
    }
    else if(type.equals("standard")) {
      garlicBread = new StandardWheatGarlicBread();
    }
    else if(type.equals("premium")) {
      garlicBread = new PremiumWheatGarlicBread();
    }
    else {
      System.out.println("GarlicBread type not recognized");
      return null;
    }
    return garlicBread;
  }
}
