package com.pluralsight.week3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    private static Scanner consoleScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Choose bedtime story: goldilocks, hansel_and_gretel, mary_had_a_little_lamb");
        String chosenStory = consoleScanner.nextLine();

        try {
            FileInputStream fis = new FileInputStream(chosenStory + ".txt");
            Scanner storyScanner = new Scanner(fis);
            while(storyScanner.hasNextLine()) {
                String line = storyScanner.nextLine();
                System.out.println(line);
            }
            storyScanner.close();
            fis.close();
            consoleScanner.close();
        } catch (IOException e) {
            System.out.println("Problem: " + e.getMessage());
        }
    }
}
