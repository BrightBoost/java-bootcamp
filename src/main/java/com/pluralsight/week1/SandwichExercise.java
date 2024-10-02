package com.pluralsight.week1;

import java.util.Scanner;

public class SandwichExercise {
    public static Scanner scanner = new Scanner(System.in);
    //    Prompt the user for the size of the sandwich (1 or 2):
    //            - 1: Regular: base price $5.45
    //            - 2: Large: base price $8.95
    //            Prompt the user for their age:
    //            - Student (17 years old or younger) — receive a 10% discount
    //            - Seniors (65 years old or older) — receive a 20% discount Display the cost of the sandwich to the screen
    public static void main(String[] args) throws Exception {
        System.out.print("What is the size of your sandwich: 1 or 2? ");
        System.out.println("- 1: Regular: base price $5.45 or - 2: Large: base price $8.95");

        int sandwichChoice = scanner.nextInt();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        // base sandwich price
        double price;
        if(sandwichChoice == 1) {
            price = 5.45;
        } else { // assume it's always either 1 or 2
            price = 8.95;
        }

        // age discount
        if(age < 18) {
            price = price * 0.9;
        } else if(age >= 65) {
            price = price * 0.8;
        }

    }
}
