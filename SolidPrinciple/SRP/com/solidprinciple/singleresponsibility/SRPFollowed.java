package com.solidprinciple.singleresponsibility;

public class SRPFollowed {

  public static void main (String[] args) {
    ShoppingCart cart = new ShoppingCart();

    cart.addProduct(new Product ("Laptop", 50000));
    cart.addProduct(new Product ("Mouse", 1000));

    ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
    printer.printInvoice();

    ShoppingCartStorage db = new ShoppingCartStorage(cart);
    db.saveToDatabase();
  }
}
