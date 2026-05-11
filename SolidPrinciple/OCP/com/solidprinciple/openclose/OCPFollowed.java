package com.solidprinciple.openclose;

public class OCPFollowed {
  public static void main (String[] args) {
    ShoppingCart cart = new ShoppingCart();
    cart.addProduct(new Product ("Laptop", 50000));
    cart.addProduct(new Product ("Mouse", 1000));

    ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
    printer.printInvoice();

    IPersistence sql = new SQLPersistence();
    IPersistence mongo = new MongoPersistence();
    IPersistence file = new FilePersistence();

    sql.save(cart);
    mongo.save(cart);
    file.save(cart);
  }
}
