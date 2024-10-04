package com.pluralsight.week2;

import java.util.Scanner;

public class CellPhoneApplication {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CellPhone cp = new CellPhone();

        System.out.println("What is the serial number?");
        int sn = scanner.nextInt();
        scanner.nextLine();
        cp.setSerialNumber(sn);

        System.out.println("What model is the phone?");
        String model = scanner.nextLine();
        cp.setModel(model);

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();
        cp.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();
        cp.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();
        cp.setOwner(owner);

        System.out.println(cp.getModel() + " | " + cp.getCarrier() + " | " + cp.getOwner() + " | " + cp.getPhoneNumber() + " | " + cp.getSerialNumber());

    }
}
