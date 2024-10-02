package com.pluralsight.week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // grab the operation
//        System.out.println("Do you want to add or subtract?");
//        String operation = scanner.nextLine();

        // grab the first number
        System.out.println("Enter nr 1:");
        float num1 = scanner.nextFloat();

        // grab the second number
        System.out.println("Enter nr 2:");
        float num2 = scanner.nextFloat();

        // perform the operation with the input numbers
        float result = num1 + num2;

        // display the result of the operation
        System.out.println(num1 + " + " + num2 + " = " + result);

    }
}
