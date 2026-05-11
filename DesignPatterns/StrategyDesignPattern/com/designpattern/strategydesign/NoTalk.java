package com.designpattern.strategydesign;

public class NoTalk implements Talkable{

  @Override
  public void talk() {
    System.out.println("No talk");
  }
}
