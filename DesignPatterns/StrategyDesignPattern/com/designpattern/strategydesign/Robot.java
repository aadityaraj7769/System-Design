package com.designpattern.strategydesign;

abstract class Robot {

  protected Talkable t;
  protected Walkable w;
  protected Flyable f;

  public Robot(Talkable t, Walkable w, Flyable f) {
    this.t = t;
    this.w = w;
    this.f = f;
  }

  public void talk()
  {
    t.talk();
  }
  public void walk() {
    w.walk();
  }
  public void fly() {
    f.fly();
  }

  public abstract void projection();
}
