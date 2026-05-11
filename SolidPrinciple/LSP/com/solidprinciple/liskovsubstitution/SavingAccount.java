package com.solidprinciple.liskovsubstitution;

import java.awt.*;


public class SavingAccount implements IWithdrawableAccount{

  private double balance;

  public SavingAccount() {
    this.balance = 0;
  }

  public void deposit(double amount) {
    this.balance += amount;
    System.out.println("Deposited " + amount + " in Savings Account. New Balance: " + this.balance);
  }

  public void withdraw(double amount) {
    if(balance >= amount) {
      this.balance -= amount;
      System.out.println("Withdrawn: " + amount + " from Savings Account. New Balance: " + this.balance);
    } else {
      System.out.println("Insufficient Funds");
    }

  }
}
