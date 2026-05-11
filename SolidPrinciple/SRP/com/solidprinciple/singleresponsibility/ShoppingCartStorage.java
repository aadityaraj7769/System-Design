package com.solidprinciple.singleresponsibility;

public class ShoppingCartStorage {

  private ShoppingCart cart;

  public ShoppingCartStorage(ShoppingCart cart) {
    this.cart = cart;
  }

  public void saveToDatabase() {
    System.out.println("Saving shopping cart to database...");
  }
}
