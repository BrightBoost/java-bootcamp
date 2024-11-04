package com.pluralsight.week7.finance;

public class CreditCard extends Account implements Valuable {
    public CreditCard(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void charge(double amount) {
        setBalance(getBalance() + amount);

    }

    public void pay(double amount) {
        setBalance(getBalance() - amount);

    }

    @Override
    public double getValue() {
        return getBalance() * -1;
    }
}
