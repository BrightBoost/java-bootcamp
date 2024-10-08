package com.pluralsight.week3.unfinishedweek2stuff;

import java.util.Scanner;

public class CellPhoneApplication {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CellPhone cellPhone1 = createCellPhone();
        CellPhone cellPhone2 = createCellPhone();

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());

    }

    public static void display(CellPhone cp) {
        System.out.println(cp.getModel() + " | " + cp.getCarrier() + " | " + cp.getOwner() + " | " + cp.getPhoneNumber() + " | " + cp.getSerialNumber());
    }

    public static CellPhone createCellPhone() {
       // CellPhone cp = new CellPhone();

        System.out.println("What is the serial number?");
        int sn = scanner.nextInt();
        scanner.nextLine();
        //cp.setSerialNumber(sn);

        System.out.println("What model is the phone?");
        String model = scanner.nextLine();
        //cp.setModel(model);

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();
       // cp.setCarrier(carrier);

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();
       // cp.setPhoneNumber(phoneNumber);

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();
       // cp.setOwner(owner);

        return new CellPhone(sn, model, carrier, phoneNumber, owner);
    }


}
