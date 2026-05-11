package com.designpattern.strategydesign;

public class NormalTalk implements Talkable{

  @Override
  public void talk() {
    System.out.println("NormalTalk");
  }
}
