package com.solidprinciple.singleresponsibility;

public class ShoppingCartPrinter {

  private ShoppingCart cart;

  public ShoppingCartPrinter (ShoppingCart cart) {
    this.cart = cart;
  }

  public void printInvoice()
  {
    System.out.println("Shopping cart invoice");
    for (Product p : cart.getProducts()) {
      System.out.println(p.name + " - Rs " + p.price);
    }

    System.out.println("Total: Rs " + cart.calculateTotal());
  }
}
