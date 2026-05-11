package com.designpattern.decorator;

public class StarPowerDecorator implements IDecorator {
  private ICharacter ch;

  public StarPowerDecorator(ICharacter ch) {
    this.ch = ch;
  }

  @Override
  public String getAbilities() {
    return ch.getAbilities() + " with Star power";
  }
}
