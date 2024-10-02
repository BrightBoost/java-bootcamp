package com.pluralsight.week1;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Yearup!");
        Scanner scannerObject = new Scanner(System.in);
        String input = scannerObject.nextLine();
        System.out.println("You've inputted: " + input);
        System.out.println("Input with length: " + input.length());

        System.out.println("Enter your highest age this year:");
        int age = scannerObject.nextInt();
        scannerObject.nextLine();
        System.out.println("You were born in the year " + (2024 - age));

        // funky things will happen
        String moreInput = scannerObject.nextLine();
        System.out.println("You've inputted: " + moreInput);

        String evenMoreInput = scannerObject.nextLine();
        System.out.println("You've inputted: " + evenMoreInput);

        scannerObject.close();

    }
}
