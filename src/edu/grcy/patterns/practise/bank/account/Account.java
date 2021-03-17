package edu.grcy.patterns.practise.bank.account;

import edu.grcy.patterns.practise.bank.InterestCalculator.InterestCalculator;
import edu.grcy.patterns.practise.bank.InterestCalculator.InterestCalculatorFactory;

public class Account {
    private String accountName;
    private int balance;
    private int interestCalculated;
    private AccountType accountType;

    public Account(String accountName, String accountType) {
        this.accountName = accountName;
        balance=0;
        interestCalculated=0;
        this.accountType= AccountType.getByShortcut(accountType);
    }

    public String getAccountName() {
        return accountName;
    }

    public int getBalance() {
        return balance;
    }

    //getter ma słiżyć do pobrania wartości
    //nie powinno się w nim wyliczać dodatkowych rzeczy
    //dlatego na naliczenie odsetek robię osobną metodę
    public int getInterestCalculated() {
        return interestCalculated;
    }


    //
    public int calculateInterest(){
        int currentInterestCalculated;
        InterestCalculator interestCalculator = InterestCalculatorFactory.getInterestCalculator(balance);
        currentInterestCalculated = interestCalculator.countInterest(balance);
        interestCalculated+=currentInterestCalculated;
        return currentInterestCalculated;
    }

    public String getAccountType() {
        return accountType.getDescription();
    }

    public int deposit(int amountToDeposit){
        balance+=amountToDeposit;
        return balance;
    }

    public int withdraw(int amountToWithdraw){
        balance-=amountToWithdraw;
        return balance;
    }

    public String getAccountInfo(){
        return new StringBuilder(accountName)
                .append(" : kapitał ")
                .append(balance)
                .append("; naliczone odsetki= ")
                .append(interestCalculated)
                .toString();
    }

    public void capitalizeInterest(){
        balance+=interestCalculated;
        interestCalculated=0;
    }
}
