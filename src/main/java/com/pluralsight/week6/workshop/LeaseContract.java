package com.pluralsight.week6.workshop;

public class LeaseContract extends Contract {
    private double expectedEndingValue;
    private double leaseFee;

    public LeaseContract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        super(date, customerName, customerEmail, vehicleSold);
        expectedEndingValue = vehicleSold.getPrice() * 0.5;
        leaseFee = vehicleSold.getPrice() * 0.07;
    }

    @Override
    public double getTotalPrice() {
        return getMonthlyPayment() * 36 + leaseFee;
    }

    @Override
    public double getMonthlyPayment() {
        return 0.04 * getVehicleSold().getPrice() / 12;
    }

    @Override
    public String toCsvEntry() {
        //LEASE|20210928|Zachary Westly|zach@texas.com|37846|2021|Chevrolet|Silverado|truck|Black|2750|31995.00|15997.50|2239.65|18337.15|541.39
        return "LEASE|" + getDate() + "|" + getCustomerName() + "|" + getCustomerEmail() + "|" + getVehicleSold().toFileString() + "|" + expectedEndingValue + "|" + leaseFee + "|" + getTotalPrice() + "|"+ getMonthlyPayment();

    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }
}
