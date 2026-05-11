package com.designpattern.strategydesign;

public class StrategyPattern {
  public static void main(String[] args) {

    Robot robot = new CompanionRobot(
        new NormalTalk(),
        new NormalWalk(),
        new NoFly()
    );

    robot.talk();
    robot.walk();
    robot.fly();
  }
}
