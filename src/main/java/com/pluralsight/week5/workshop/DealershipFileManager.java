package com.pluralsight.week5.workshop;

import java.io.*;

public class DealershipFileManager {
    public static Dealership getDealership() {
        Dealership dealership;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("dealershipInventory.csv"));
            // read the first line of the csv, which is a dealership
            String[] dealershipParts = bufferedReader.readLine().split("\\|");
            dealership = new Dealership(dealershipParts[0], dealershipParts[1], dealershipParts[2]);
            String line;
            while((line = bufferedReader.readLine()) != null) {
                String[] vehicleParts = line.split("\\|");
                Vehicle vehicle = new Vehicle(Integer.parseInt(vehicleParts[0]), Integer.parseInt(vehicleParts[1]), vehicleParts[2], vehicleParts[3], vehicleParts[4], vehicleParts[5], Integer.parseInt(vehicleParts[6]), Double.parseDouble(vehicleParts[7]));
                dealership.addVehicle(vehicle);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return dealership;

    }

    public static void saveDealership(Dealership dealership) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dealershipInventory.csv"));
            // read the first line of the csv, which is a dealership
            bufferedWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
            for(Vehicle v : dealership.getInventory()) {
                bufferedWriter.write("\n" + v.toFileString());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
