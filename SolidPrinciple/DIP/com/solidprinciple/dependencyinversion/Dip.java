package com.solidprinciple.dependencyinversion;

public class Dip {
  public static void main(String[] args) {
    MySQLDatabase mysql = new MySQLDatabase();

    MongoDBDatabase mongo = new MongoDBDatabase();

    UserService service1 = new UserService(mysql);
    UserService service2 = new UserService(mongo);

    service1.storeUser("Aditya");
    service2.storeUser("Raj");
  }
}
