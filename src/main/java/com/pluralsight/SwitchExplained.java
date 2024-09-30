package com.pluralsight;

import java.util.Scanner;

public class SwitchExplained {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();

        if(grade.startsWith("A")) {
            System.out.println("Great job!");
        } else if(grade.startsWith("B")) {
            System.out.println("Nice!");
        } else if(grade.startsWith("C")) {
            System.out.println("Alright, Cs get degrees!");
        } else if(grade.startsWith("D")) {
            System.out.println("Auch, try again");
        } else if(grade.startsWith("F")) {
            System.out.println("Oops...");
        } else {
            System.out.println("I don't know that grade.");
        }
        System.out.println("*************");

        // rewrite the if chain as a switch statement
        switch (grade) {
            case "A":
                System.out.println("Great job!");
                break;
            case "B":
                System.out.println("Nice!");
                break;
            case "C":
                System.out.println("Cs get degrees!");
                break;
            case "D":
                System.out.println("Ach, try again!");
                break;
            case "F":
                System.out.println("Oops!");
                break;
            default:
                System.out.println("I don't know that grade.");
                break;
        }

    }
}
