package com.designpattern.abstractfactory;

import com.designpattern.abstractfactory.burger.Burger;
import com.designpattern.abstractfactory.garlicbread.GarlicBread;


public interface BurgerFactory {
  Burger createBurger(String type);

  GarlicBread createGarlicBread(String type);
}
