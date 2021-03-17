package edu.grcy.patterns.practise.bank.endOfMonth;

import edu.grcy.patterns.practise.bank.client.Client;

import java.util.List;

public class EndOfMonthSummary implements EndOfMonth{

    private List<Client> clients;

    public EndOfMonthSummary(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public void performOperation() {
        clients.stream()
                .forEach(x-> System.out.println(x.getClientInfo()));
    }
}
