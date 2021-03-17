package edu.grcy.patterns.practise.bank.testingAccounts;

import edu.grcy.patterns.practise.bank.account.Account;
import edu.grcy.patterns.practise.bank.account.AccountFactory;
import edu.grcy.patterns.practise.bank.InterestCalculator.InterestCalculatorInit;
import edu.grcy.patterns.practise.bank.client.Client;
import edu.grcy.patterns.practise.bank.endOfMonth.EndOfMonth;
import edu.grcy.patterns.practise.bank.endOfMonth.EndOfMonthInterestCapitalisation;
import edu.grcy.patterns.practise.bank.endOfMonth.EndOfMonthSummary;

import java.util.List;

public class TestingAccounts {
    public static void main(String[] args) {
        InterestCalculatorInit init = new InterestCalculatorInit();
        init.interestCalculatorInit();

        System.out.println("=====================");
        System.out.println("=====================");
        int currentInterest;
        Account account = AccountFactory.getAccount("c","Konto 1");
        System.out.println(account.getAccountName());


        depositAndShow(account, 500);
        depositAndShow(account, 550000);
        //^^to zastępuje to niżej
//        System.out.println("=====================");
//        System.out.println("=====================");
//        account.deposit(550000);
//        currentInterest = account.calculateInterest();
//        System.out.println(account.getAccountInfo());
//        System.out.println("Bieżące odsetki dla konta: "+ currentInterest);


        withdrawAndShow(account,100000);
        //^^to zastępuje to nizej
//        System.out.println("=====================");
//        System.out.println("=====================");
//        account.withdraw(100000);
//        currentInterest = account.calculateInterest();
//        System.out.println(account.getAccountInfo());
//        System.out.println("Bieżące odsetki dla konta: "+ currentInterest);

        grubaKrecha();
        Account account2 = AccountFactory.getAccount("c","Konto 2");
        System.out.println(account2.getAccountName());
        depositAndShow(account2,2000);
        depositAndShow(account2,5000);

        EndOfMonth endOfMonthProcess1 = new EndOfMonthInterestCapitalisation(List.of(account, account2));
        endOfMonthProcess1.performOperation();

        grubaKrecha();
        List.of(account,account2)
                .stream()
                .forEach(x-> System.out.println(x.getAccountName()+"; balance= "+
                        x.getBalance()+ "; interest "+
                        x.getInterestCalculated()+";"));

        Client client1 = new Client("Marek","Biernat");
        Client client2 = new Client("Olgierd","Luksik");
        client1.addAccount(account);
        client1.addAccount(account2);
        Account account3 = AccountFactory.getAccount("c","Konto 3");
        Account account4 = AccountFactory.getAccount("s","Konto 4");
        client2.addAccount(account3);
        client2.addAccount(account4);
        grubaKrecha();
        depositAndShow(account3,25000);
        depositAndShow(account4,200);
        List.of(client1,client2)
                .stream()
                .forEach(x-> System.out.println(x.getClientInfo()));

        new EndOfMonthSummary(List.of(client1,client2)).performOperation();
    }

    private static void grubaKrecha(){
        System.out.println("=====================");
        System.out.println("=====================");
    }
    private static void withdrawAndShow(Account account, int amount){

        int currentInterest;
        System.out.println("=====================");
        System.out.println("=====================");
        account.withdraw(amount);
        currentInterest = account.calculateInterest();
        System.out.println(account.getAccountInfo());
        System.out.println("Bieżące odsetki dla konta: "+ currentInterest);
    }


    private static void depositAndShow(Account account, int amount){

        int currentInterest;
        System.out.println("=====================");
        System.out.println("=====================");
        account.deposit(amount);
        currentInterest = account.calculateInterest();
        System.out.println(account.getAccountInfo());
        System.out.println("Bieżące odsetki dla konta: "+ currentInterest);
    }
}
