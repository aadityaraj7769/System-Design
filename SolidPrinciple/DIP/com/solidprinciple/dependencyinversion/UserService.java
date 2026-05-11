package com.solidprinciple.dependencyinversion;

public class UserService {

  private IDatabase db;

  public UserService(IDatabase database) {
    this.db = database;
  }

  public void storeUser(String user) {
    db.save(user);
  }

}
