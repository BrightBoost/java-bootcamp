package com.pluralsight.week3.unfinishedweek2stuff;

import java.util.Scanner;

public class GuessTheNumberGame {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean dontQuitYet = true;
        do {
            // think of a number
            int correctNumber = (int) Math.floor(Math.random()*10);
            boolean notGuessed = true;
            do {

                // make the user guess
                System.out.println("Guess the number:");
                int guess = scanner.nextInt();
                scanner.nextLine();

                // give feedback
                if (correctNumber > guess) {
                    System.out.println("Guess higher!");
                } else if (correctNumber < guess) {
                    System.out.println("Guess lower!");
                } else {
                    notGuessed = false;
                    System.out.println("Woohoo, you guessed right! Play again? y / n");
                    String answerToPlayAgain = scanner.nextLine().toLowerCase();
                    if (!answerToPlayAgain.equals("y")) {
                        dontQuitYet = false;
                    }
                }
            } while(notGuessed);
        } while(dontQuitYet);
        System.out.println("Ok bye.");
    }

}
