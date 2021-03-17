package edu.grcy.patterns.practise.bank.account;

public enum AccountType {
    CURRENT("c","bieżące"),
    SAVINGS("s","oszczędnościowe");

    private String shortcut;
    private String description;

    AccountType(String shortcut, String description) {
        this.shortcut = shortcut;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static AccountType getByShortcut(String shortcut){
       for (AccountType accountType : AccountType.values()){
           if (shortcut.equals(accountType.shortcut)){
               return accountType;
           }
       }
       return null;
    }
}
