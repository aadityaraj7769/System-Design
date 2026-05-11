package com.solidprinciple.openclose;

public class FilePersistence implements IPersistence {

  @Override
  public void save (ShoppingCart cart) {
    System.out.println("Saving shopping cart to a file...");
  }
}
