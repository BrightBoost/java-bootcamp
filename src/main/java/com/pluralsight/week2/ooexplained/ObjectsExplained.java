package com.pluralsight.week2.ooexplained;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ObjectsExplained {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Reservation reservation = getReservationFromInput();


        // split name for displaying
        String[] names = reservation.getFullName().split(" ");
        String displayName = names[1] + ", " + names[0];

        // ticket or tickets
        String ticketWord = reservation.getNrOfTickets() == 1 ? "ticket" : "tickets";

        // display confirmation
        System.out.println(reservation.getNrOfTickets() + " " + ticketWord + " reserved for " + reservation.getDate() + " under " + displayName);
    }

    public static Reservation getReservationFromInput() {
        // input
        System.out.println("Please enter your name:");
        String fullName = scanner.nextLine();

        System.out.println("What date will you be coming (MM/dd/yyyy):");
        String date = scanner.nextLine();
        // parse the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reservationDate = LocalDate.parse(date, dtf);

        System.out.println("How many tickets would you like?");
        int nrOfTickets = scanner.nextInt();

        Reservation reservation = new Reservation();
        reservation.setDate(reservationDate);
        reservation.setFullName(fullName);
        reservation.setNrOfTickets(nrOfTickets);

        return reservation;

    }
}
