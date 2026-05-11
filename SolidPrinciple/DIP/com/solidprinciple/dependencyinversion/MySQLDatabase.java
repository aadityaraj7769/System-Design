package com.solidprinciple.dependencyinversion;

public class MySQLDatabase implements IDatabase {

  @Override
  public void save(String data) {
    System.out.println("Executing SQL Query: INSERT INTO users VALUES('" + data + "')");
  }
}
