package com.designpattern.decorator;

public class GunPowerDecorator implements IDecorator {
  private ICharacter ch;

  public GunPowerDecorator(ICharacter ch) {
    this.ch = ch;
  }

  @Override
  public String getAbilities() {
    return ch.getAbilities() + " with Gun power";
  }
}
