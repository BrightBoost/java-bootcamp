package com.pluralsight.week2;

import java.util.Scanner;

public class FullNameParser {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // get fullname input
        System.out.println("Please enter your full name:");
        String fullname = scanner.nextLine();

        // split fullname input on the spaces and story in array string
        String[] nameParts = fullname.split("\\s");

        // create variables for nameparts
        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        // check length
        if(nameParts.length == 2) {        // if length is 2: fn arr[0], mn (none), ln arr[1]
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if(nameParts.length == 3) {         // if length is 3: fn arr[0], mn arr[1], ln arr[2]
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {
            System.out.println("ISSUE!");
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
