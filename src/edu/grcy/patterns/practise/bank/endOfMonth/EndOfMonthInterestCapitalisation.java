package edu.grcy.patterns.practise.bank.endOfMonth;

import edu.grcy.patterns.practise.bank.account.Account;

import java.util.List;

public class EndOfMonthInterestCapitalisation implements EndOfMonth{

    List<Account> accounts;

    public EndOfMonthInterestCapitalisation(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public void performOperation() {
        accounts.stream()
                .filter(account -> account.getBalance()>0)
                .forEach(Account::capitalizeInterest);

    }
}
