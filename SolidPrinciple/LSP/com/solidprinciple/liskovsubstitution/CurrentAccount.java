package com.solidprinciple.liskovsubstitution;

public class CurrentAccount implements IWithdrawableAccount{

  private double balance;

  public CurrentAccount() {
    this.balance = 0;
  }

  public void deposit(double amount) {
    this.balance += amount;
    System.out.println("Deposited " + amount + " in Current Account. New Balance: " + this.balance);
  }

  public void withdraw(double amount) {
    if(balance >= amount) {
      this.balance -= amount;
      System.out.println("Withdrawn: " + amount + " from Current Account. New Balance: " + this.balance);
    } else {
      System.out.println("Insufficient Funds");
    }

  }
}
