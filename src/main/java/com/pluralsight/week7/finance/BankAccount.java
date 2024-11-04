package com.pluralsight.week7.finance;

public class BankAccount extends Account implements Valuable {

    public BankAccount(String name, String accountNumber, double balance) {
        super(name, accountNumber, balance);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }


}
