package com.pluralsight.week9.shipperExercise;

import com.pluralsight.week9.CityDataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static ShipperDao shipperDao;
    public static void main(String[] args) {
        init(args);
        System.out.println(shipperDao.findAll());
        scanner = new Scanner(System.in);
        Shipper shipper = promptShipperData();
        saveShipper(shipper);



    }

    public static void init(String[] args) {
        BasicDataSource bds = new BasicDataSource();
        bds.setUrl("jdbc:mysql://localhost:3306/northwind");
        bds.setUsername(args[0]);
        bds.setPassword(args[1]);

        shipperDao = new ShipperDao(bds);

    }
    public static Shipper promptShipperData() {
        System.out.println("What is the name of the new shipper?");
        String name = scanner.nextLine();
        System.out.println("What is the phone number of the new shipper?");
        String phone = scanner.nextLine();
        return new Shipper(0, name, phone);

    }

    public static void saveShipper(Shipper shipper) {
        int newId = shipperDao.save(shipper);
        System.out.println(newId);
    }
}
