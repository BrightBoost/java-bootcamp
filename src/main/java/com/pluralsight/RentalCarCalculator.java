package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    static Scanner scanner = new Scanner(System.in);

   // - pickup date (store as a string)
//- number of days for the rental
//- whether they want an electronic toll tag at $3.95/day (yes/no)
//- whether they want a GPS at $2.95/day (yes/no)
//- whether they want roadside assistance at $3.95/day (yes/no)
//- their current age
    public static void main(String[] args) {
        String pickupDate = promptGetStringValue("What date do you want to pick up the car?");
        double nrOfDays = promptGetDoubleValue("How many days?");
        String electronicTollTag = promptGetStringValue("Do you want an electronic toll tag at $3.95/day (yes/no)?");
        String gps = promptGetStringValue("Do you want a GPS at $2.95/day (yes/no)?");
        String roadsideAssistance = promptGetStringValue("Do you want want roadside assistance at $3.95/day (yes/no)");
        double age = promptGetDoubleValue("How old are you?");
        double totalPrice = calculateCarRentalPrice(nrOfDays, electronicTollTag, gps, roadsideAssistance, age);
        displayReceipt(totalPrice, nrOfDays, electronicTollTag, gps, roadsideAssistance, age);
    }

    public static String promptGetStringValue(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    public static double promptGetDoubleValue(String message) {
        System.out.println(message);
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public static double calculateCarRentalPrice(double nrOfdays, String electronicTollTag, String gps, String roadsideAssistance, double age) {
        double price = 29.99;

        if(electronicTollTag.equalsIgnoreCase("yes")) {
            price += 3.95;
        }
        if(gps.equalsIgnoreCase("yes")) {
            price += 2.95;
        }
        if(roadsideAssistance.equalsIgnoreCase("yes")) {
            price += 3.95;
        }
        if(age < 25) {
            price = price * 1.3;
        }

        return price * nrOfdays;
    }

    public static void displayReceipt(double totalprice, double nrOfdays, String electronicTollTag, String gps, String roadsideAssistance, double age) {
        double optionCosts = 0.0;


        if(electronicTollTag.equalsIgnoreCase("yes")) {
            optionCosts += 3.95;
        }
        if(gps.equalsIgnoreCase("yes")) {
            optionCosts += 2.95;
        }
        if(roadsideAssistance.equalsIgnoreCase("yes")) {
            optionCosts += 3.95;
        }

        System.out.println("The total price is: " + totalprice);
        if(age < 25) {
            System.out.println("Underage driver surcharge: " + (totalprice / 130 * 30));
        }
        System.out.println("The basic car rental price: " + (29.99 * nrOfdays));
        System.out.println("The options costs are: " + (nrOfdays * optionCosts));

    }
}
