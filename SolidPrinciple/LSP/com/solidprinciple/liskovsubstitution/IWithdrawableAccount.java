package com.solidprinciple.liskovsubstitution;

public interface IWithdrawableAccount extends IDepositOnlyAccount{
  void withdraw(double amount);
}
