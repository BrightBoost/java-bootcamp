package com.pluralsight;

public class MortgageCalculator {

    public static void main(String[] args) {
        double principal = 53000;
        double annualInterestRate = 7.625 / 100;
        int loanTermYears = 15;

        // Calculate monthly interest rate and total number of payments
        double monthlyInterestRate = annualInterestRate / 12;
        int totalPayments = loanTermYears * 12;

        // formula
        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);

        System.out.println(monthlyPayment);
    }
}

