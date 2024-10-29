package com.pluralsight.week5.workshop;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public UserInterface() {
    }

    private static Scanner scanner = new Scanner(System.in);

    private void init() {
        this.dealership = DealershipFileManager.getDealership();
    }

    private void displayVehicles(List<Vehicle> vehicleList) {
        for(Vehicle v: vehicleList) {
            System.out.println(v);
        }
    }

    public void display() {
        init();
        System.out.println("What do you want to do?");
        String options = """
        Please select options below : \
        1 - Find vehicles within price range \
        2 - Find vehicles by make / model \
        3 - Find vehicles by year range \
        4 - Find vehicles by color \
        5 - Find vehicles by mileage range \
        6 - Find vehicles by type(car, truck, SUV, van) \
        7 - List all vehicles \
        8 - Add a vehicle \
        9 - Remove a vehicle \
        99 - Quit.\s
        """;
        System.out.println(options);
        String choice = scanner.nextLine();
        switch(choice) {
            case "1":
                processGetByPriceRequest();
                break;
            case "2":
                processGetByMakeModelRequest();
                break;
            case "3":
                processGetByYearRequest();
                break;
            case "4":
                processGetByColorRequest();
                break;
            case "5":
                processGetByMileageRequest();
                break;
            case "6":
                processGetByVehicleTypeRequest();
                break;
            case "7":
                processGetAllVehiclesRequest();
                break;
            case "8":
                processAddVehicleRequest();
                break;
            case "9":
                processRemoveVehicleRequest();
                break;
            case "99":
                System.exit(0);
                break;
        }



    }

    public void processGetByPriceRequest() {
        System.out.println("What is min and max?");
        double min = scanner.nextDouble();
        scanner.nextLine();
        double max = scanner.nextDouble();
        scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByPrice(min, max);
        displayVehicles(vehicleList);
    }
    public void processGetByMakeModelRequest() {
        System.out.println("What is make and model?");
        String make = scanner.nextLine();
        String model = scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicleList);
    }
    public void processGetByYearRequest() {
        System.out.println("What is min and max?");
        int min = scanner.nextInt();
        scanner.nextLine();
        int max = scanner.nextInt();
        scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByYear(min, max);
        displayVehicles(vehicleList);
    }
    public void processGetByColorRequest() {
        System.out.println("What is color?");
        String color = scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByColor(color);
        displayVehicles(vehicleList);
    }
    public void processGetByMileageRequest() {
        System.out.println("What is min and max?");
        int min = scanner.nextInt();
        scanner.nextLine();
        int max = scanner.nextInt();
        scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByMileage(min, max);
        displayVehicles(vehicleList);
    }
    public void processGetByVehicleTypeRequest() {
        System.out.println("What is type?");
        String type = scanner.nextLine();
        List<Vehicle> vehicleList = dealership.getVehiclesByType(type);
        displayVehicles(vehicleList);
    }
    public void processGetAllVehiclesRequest() {
        List<Vehicle> vehicleList = dealership.getAllVehicles();
        displayVehicles(vehicleList);
    }

    public void processAddVehicleRequest() {
        // get all the data to add a vehicle and create a new vehicle
        System.out.println("Vin?");
        int vin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Year?");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Make");
        String make = scanner.nextLine();
        System.out.println("Model?");
        String model = scanner.nextLine();
        System.out.println("Vehicle type?");
        String vehicleType = scanner.nextLine();
        System.out.println("Color?");
        String color = scanner.nextLine();
        System.out.println("Odemeter?");
        int odometer = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Price?");
        double price = scanner.nextDouble();
        scanner.nextLine();

        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

        this.dealership.addVehicle(vehicle);
        DealershipFileManager.saveDealership(this.dealership);
    }

    public void processRemoveVehicleRequest() {
        System.out.println("What is vin of vehicle to be removed?");
        int vin = scanner.nextInt();
        scanner.nextLine();
        dealership.removeVehicle(vin);
        displayVehicles(this.dealership.getInventory());
        DealershipFileManager.saveDealership(this.dealership);
    }
}
