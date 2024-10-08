package com.pluralsight.week3.unfinishedweek2stuff;

public class LoopingExercises {
    public static void main(String[] args) {
        // while loop to print I love Java 5 times
        // while loop, a counter, a string "I love Java", print method, increment counter
        int counter = 0;
        String text = "I love Java";
        while(counter < 5) {
            System.out.println(text);
            counter++;
        }

        counter = 0;
        do {
            System.out.println(text);
            counter++;
        } while(counter < 5);

        for(int i = 0; i < 5; i++) {
            System.out.println(text);
        }
    }
}
