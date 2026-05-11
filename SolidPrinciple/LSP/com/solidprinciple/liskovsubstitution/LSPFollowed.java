package com.solidprinciple.liskovsubstitution;

import java.util.ArrayList;
import java.util.List;


public class LSPFollowed {
  public static void main (String[] args) {
    List<IWithdrawableAccount> accounts = new ArrayList<>();
    accounts.add(new CurrentAccount());
    accounts.add(new SavingAccount());

    List<IDepositOnlyAccount> deposits = new ArrayList<>();
    deposits.add(new FixedDepositAccount());

    BankClient client = new BankClient(accounts, deposits);
    client.processTransaction();
  }
}
