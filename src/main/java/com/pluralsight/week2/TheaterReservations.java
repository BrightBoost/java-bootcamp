package com.pluralsight.week2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // input
        System.out.println("Please enter your name:");
        String fullName = scanner.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String date = scanner.nextLine();

        System.out.println("How many tickets would you like?");
        int nrOfTickets = scanner.nextInt();

        // parse the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(date, dtf);

        // split name for displaying
        String[] names = fullName.split(" ");
        String displayName = names[1] + ", " + names[0];

        // ticket or tickets
        String ticketWord = nrOfTickets == 1 ? "ticket" : "tickets";

        // display confirmation
        System.out.println(nrOfTickets + " " + ticketWord + " reserved for " + reservationDate.format(dtf) + " under " + displayName);
    }
}
