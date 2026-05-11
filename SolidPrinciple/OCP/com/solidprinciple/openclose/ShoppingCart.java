package com.solidprinciple.openclose;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  private List<Product> products = new ArrayList<>();

  public void addProduct (Product p) {
    products.add(p);
  }

  public List<Product> getProducts() {
    return products;
  }

  public double calculateTotal() {
    double total = 0;
    for (Product p : products) {
      total += p.price;
    }

    return total;
  }
}
