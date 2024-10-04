package com.pluralsight.week2;

/**
 ## While loop
 - I want you to write a loop, that prints "Hi " + the numbers of times the loop has been running, until a Math.random() generates a value under 0.05.

 ## For loop
 - Please print the even numbers under 20 using a for loop

 ## For each loop
 - Create a array of your favorite fruits and vegetables and print for every element in the array: I love + nameOfTheThing


 ## Bonus exercise
 Print the song "10 little monkeys jumping on the bed, one fell of and bumped his head, mommy called the doctor and the doctor said no more monkeys jumping on the bed"

 Please mind, when you get down to 1 monkey, no monkeyS.

 Try to do this in minimum nr of lines.
 */
public class LoopsExercise {
    public static void main(String[] args) {
        bonusExercise(1000);
    }
    public static void whileExercise() {
        int i = 0;
        while(Math.random() > 0.05) {
            System.out.println("Hi " + i);
            i++;
        }
    }

    public static void forExercise() {
        for(int i = 0; i < 20; i = i + 2) {
            System.out.println(i);
        }

        // alternatively, module
        for(int i = 0; i < 20; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void forEachExercise() {
        String[] favoriteFruitsAndVegetables = {"grapefruit", "broccoli", "carrots", "avocado"};
        for(String favoriteItem : favoriteFruitsAndVegetables) {
            System.out.println("I love " + favoriteItem);
        }
    }

    public static void bonusExercise(int nrOfMonkeys) {
        for(int i = nrOfMonkeys; i > 0; i--) {
            System.out.println(i + " little " + (i == 1 ? "monkey" : "monkeys") + " rest of thesong");
        }
        System.out.println("no more monkeys! rest of the song");
    }
}
