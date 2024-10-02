package com.pluralsight.week1;

import java.util.Scanner;

public class DemoCompoundInterestCalculator {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // getting the input we need
        System.out.println("Deposit?");
        double principal = scanner.nextDouble();

        System.out.println("Interest rate?");
        double interestRate = scanner.nextDouble() / 100;

        System.out.println("Number of years?");
        int years = scanner.nextInt();

        // formula
        double amount = principal * Math.pow(1 + interestRate/12, 12*years);

        // display result
        System.out.println(amount);


    }

}
