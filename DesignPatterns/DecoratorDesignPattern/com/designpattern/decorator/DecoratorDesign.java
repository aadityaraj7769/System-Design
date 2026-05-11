package com.designpattern.decorator;

public class DecoratorDesign {
  public static void main(String[] args) {
    ICharacter mario = new HeightUpDecorator(new GunPowerDecorator(new StarPowerDecorator(new SuperMario())));

    System.out.println(mario.getAbilities());
  }
}
