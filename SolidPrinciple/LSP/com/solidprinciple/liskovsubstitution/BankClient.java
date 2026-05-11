package com.solidprinciple.liskovsubstitution;

import java.util.ArrayList;
import java.util.List;


public class BankClient {

  private List<IWithdrawableAccount> _withdrawableAccounts;
  private List<IDepositOnlyAccount> _depositOnlyAccounts;

  public BankClient (List<IWithdrawableAccount> withdrawableAccount, List<IDepositOnlyAccount> depositOnlyAccount) {
    this._withdrawableAccounts = withdrawableAccount;
    this._depositOnlyAccounts = depositOnlyAccount;
  }

  public void processTransaction() {
    for(IWithdrawableAccount acc : _withdrawableAccounts) {
      acc.deposit(5000);
      acc.withdraw(1000);
    }
    for(IDepositOnlyAccount acc : _depositOnlyAccounts) {
      acc.deposit(5000);
    }
  }
}
