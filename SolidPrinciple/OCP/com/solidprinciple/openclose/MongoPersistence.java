package com.solidprinciple.openclose;

public class MongoPersistence implements IPersistence{

  @Override
  public void save(ShoppingCart cart) {
    System.out.println("Saving shopping cart to MongoDB...");
  }
}
