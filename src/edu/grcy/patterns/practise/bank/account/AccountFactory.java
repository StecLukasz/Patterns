package edu.grcy.patterns.practise.bank.account;

public class AccountFactory {

    public static Account getAccount(String shortcut,String name) {
        // narazie nasz fabryka zwraca zawsze taki sam typ konta,
        // ale jeszcze go porozdzielamy
        if (AccountType.getByShortcut(shortcut) != null) {
            return new Account(name, shortcut);
        }
        return null;
    }
}
