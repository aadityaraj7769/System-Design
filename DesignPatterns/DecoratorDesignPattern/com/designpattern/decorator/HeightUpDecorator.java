package com.designpattern.decorator;

public class HeightUpDecorator implements IDecorator {
  private ICharacter ch;

  public HeightUpDecorator(ICharacter ch) {
    this.ch = ch;
  }

  @Override
  public String getAbilities() {
    return ch.getAbilities() + " Height is Up";
  }
}
