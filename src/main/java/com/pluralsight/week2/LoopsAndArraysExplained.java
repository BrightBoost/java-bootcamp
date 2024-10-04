package com.pluralsight.week2;

public class LoopsAndArraysExplained {
    public static void main(String[] args) {
        explainForLoop();
    }

    // four types of loops: while, do/while, for loop, for each loop

    // while loop is for non numeric conditions (typically)
    public static void exampleWhileLoop() {
        boolean done = false;
        while(!done) {
            System.out.println("Try to complete....");
            if(Math.random() > 0.9) {
                done = true;
            }
        }

        // this is typically done with a for loop
        int x= 0;
        while(x < 1000) {
            System.out.println(x++);
        }
    }

    // is for numeric conditions typically
    public static void explainForLoop() {
        // initialize counter; condition; action after every iteration (often i++)
        for(int i  = 0; i < 10; i++) {
            System.out.println(i);
        }

        //modifying the array requires the index,
        // which we have for the for loop and not the foreach loop
        String[] names = {"Cesar", "Jesus", "Van Tam", "Akbar", "Adrian"};
        for(int i = 0; i < names.length; i++) {
            names[i] = "Person";
            System.out.println("Hi " + names[i]);
        }

        System.out.println(names[1]);



    }

    public static void nameExample() {
        String[] names = {"Cesar", "Jesus", "Van Tam", "Akbar", "Adrian"};

        for(String name : names) { // for every name in the array names do { this code }
            System.out.println("Hi " + name);
        }
    }

    public static void gradeExample() {
        int[] grades = {100, 95, 90, 100, 96};

        // without loop
        int sumOfGrades = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];

        int sumOfGradesWithLoop = 0;
        // with for each loop
        for(int grade : grades) {
            sumOfGradesWithLoop += grade;
        }
        int nrOfGrades = grades.length;

        double avgGrade = (double) sumOfGradesWithLoop / nrOfGrades;
        System.out.println(avgGrade);
    }
}
