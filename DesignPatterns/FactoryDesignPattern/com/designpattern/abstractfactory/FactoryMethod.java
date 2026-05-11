package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.burger.Burger;
import com.designpattern.abstractfactory.garlicbread.GarlicBread;


public class FactoryMethod {
  public static void main(String[] args) {
    SinghBurger sBurger = new SinghBurger();
    Burger simpleBurger = sBurger.createBurger("premium");
    GarlicBread simpleGarlicBread = sBurger.createGarlicBread("premium");
    simpleBurger.prepare();
    simpleGarlicBread.prepare();

    KingBurger kingBurger = new KingBurger();
    Burger wheatBurger = kingBurger.createBurger("standard");
    GarlicBread wheatGarlicBread = kingBurger.createGarlicBread("standard");
    wheatBurger.prepare();
    wheatGarlicBread.prepare();
  }
}
