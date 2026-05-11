package com.solidprinciple.dependencyinversion;

public class MongoDBDatabase implements IDatabase{

  @Override
  public void save(String data) {
    System.out.println("Executing MongoDB Function: db.users.insert({name: '" + data + "'})");
  }
}
