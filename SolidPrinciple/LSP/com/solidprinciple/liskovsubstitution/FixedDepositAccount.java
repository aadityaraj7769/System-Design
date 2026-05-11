package com.solidprinciple.liskovsubstitution;

public class FixedDepositAccount implements IDepositOnlyAccount{

  private double balance;

  public FixedDepositAccount() {
    this.balance = 0;
  }

  public void deposit(double amount) {
    this.balance += amount;
    System.out.println("Deposited " + amount + " in Fixed Deposit Account. New Balance: " + this.balance);

  }
}
