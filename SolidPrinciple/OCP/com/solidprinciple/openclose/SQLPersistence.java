package com.solidprinciple.openclose;

public class SQLPersistence implements IPersistence {

  @Override
  public void save(ShoppingCart cart) {
    System.out.println("Saving shopping cart to SQL DB...");
  }
}
