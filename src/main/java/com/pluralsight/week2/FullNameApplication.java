package com.pluralsight.week2;

import java.util.Scanner;

public class FullNameApplication {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine().trim();

        System.out.println("Please enter your middle name:");
        String middleName = scanner.nextLine().trim();

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine().trim();

        System.out.println("Please enter your suffix:");
        String suffix = scanner.nextLine().trim();

        System.out.println(getFullName(firstName, middleName, lastName, suffix));

    }

    public static String getFullName(String firstName, String middleName, String lastName, String suffix) {
        // John J. Smith, PhD
        String fullName = "";

        if(!firstName.isEmpty()) {
            fullName += firstName + " ";
        }
        if(!middleName.isEmpty()) {
            fullName += middleName + " ";
        }
        if(!lastName.isEmpty()) {
            fullName += lastName;
        }
        if(!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        return fullName;
    }
}
