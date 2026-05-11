package com.designpattern.chainofresponsibility;

public class ChainOfResponsibility {
  public static void main(String[] args) {
    MoneyHandler thousandHandler = new ThousandHandler(5);
    MoneyHandler fiveHundredHandler = new FiveHundredHandler(10);
    MoneyHandler twoHundredHandler = new TwoHunderedHandler(20);
    MoneyHandler oneHundredHandler = new OneHundredHandler(10);

    thousandHandler.setNextHandler(fiveHundredHandler);
    fiveHundredHandler.setNextHandler(twoHundredHandler);
    twoHundredHandler.setNextHandler(oneHundredHandler);

    thousandHandler.dispense(16000);
  }
}
