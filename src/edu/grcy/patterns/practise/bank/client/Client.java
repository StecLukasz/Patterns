package edu.grcy.patterns.practise.bank.client;

import edu.grcy.patterns.practise.bank.account.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    private String name;
    private String surname;
    private List<Account> clientAccounts;


    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
        clientAccounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getFullName(){
        return surname + " " + name + " ";
    }
    public void addAccount(Account account){
        clientAccounts.add(account);
    }
    public String getClientInfo(){
        return new StringBuilder(getFullName())
                .append(clientAccounts.stream()
                        .map(Account::getAccountInfo)
                        .collect(Collectors.joining("\n")))
                .toString();
    }



}
