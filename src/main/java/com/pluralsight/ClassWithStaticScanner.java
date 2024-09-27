package com.pluralsight;

import java.util.Scanner;

public class ClassWithStaticScanner {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        performCalculation();
        scanner.close();
    }

    public static void performCalculation() {
        String chosenOperation = chooseOperation();
        // switch statement for the chosen operation
        switch (chosenOperation) {
            case "add":
                add();
                break;
            case "multiply":
                multiply();
                break;
            default:
                System.out.println("Sorry, no can do.");
        }

    }

    public static String chooseOperation() {
        System.out.println("What operation do you want?");
        String operation = scanner.nextLine();
        return operation;
    }

    public static void add() {
        System.out.println("Enter a number please: ");
        double nr1 = scanner.nextDouble();
        System.out.println("Enter a number please: ");
        double nr2 = scanner.nextDouble();
        System.out.println("Result is: " + (nr1 + nr2));
    }

    public static void multiply() {
        System.out.println("Enter a number please: ");
        double nr1 = scanner.nextDouble();
        System.out.println("Enter a number please: ");
        double nr2 = scanner.nextDouble();
        System.out.println("Result is: " + (nr1 * nr2));
    }

}
