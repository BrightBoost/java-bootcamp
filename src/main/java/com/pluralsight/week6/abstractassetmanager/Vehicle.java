package com.pluralsight.week6.abstractassetmanager;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        double result = getOriginalCost();
        int age = LocalDate.now().getYear() - year;
        if(age <= 3) {
            result = result * Math.pow(0.97, age);
        } else if(age <= 6) {
            result = result * Math.pow(0.94, age);
        } else if(age <= 10) {
            result = result * Math.pow(0.92, age);
        } else {
            result = 1000;
        }

        if(odometer > 100_000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota")) {
            result = result * 0.75;
        }
        return result;
    }
}
