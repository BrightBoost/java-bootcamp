package com.pluralsight.week6.workshop;

public class SalesContract extends Contract {
    private static final double SALES_TAX = 5;
    private static final double RECORDING_FEE = 100;

    private double processingFee;
    private  boolean finance;

    public SalesContract(String date, String customerName, String customerEmail, Vehicle vehicleSold, boolean finance) {
        super(date, customerName, customerEmail, vehicleSold);
        this.finance = finance;
    }

    public double getProcessingFee() {
        if(getVehicleSold().getPrice() >= 10_000) {
            return 495;
        } else {
            return 295;
        }
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override
    public double getTotalPrice() {
        return getVehicleSold().getPrice() * (1 + SALES_TAX/100) + processingFee + RECORDING_FEE;
    }

    @Override
    public double getMonthlyPayment() {
        if(!finance) {
            return 0;
        }
        double amount = getTotalPrice();
        double monthlyInterestRate = getVehicleSold().getPrice() >= 10_000 ? 4.25 : 5.25;
        double months = getVehicleSold().getPrice() >= 10_000 ? 48 : 24;
        return amount * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, months)) /
                (Math.pow(1 + monthlyInterestRate, months) - 1);
    }

    @Override
    public String toCsvEntry() {
        //SALE|20210928|Dana Wyatt|dana@texas.com|10112|1993|Ford|Explorer|SUV|Red|525123|995.00|49.75|100.00|295.00|1439.75|NO|0.00
        return "SALE|" + getDate() + "|" + getCustomerName() + "|" + getCustomerEmail() + "|" + getVehicleSold().toFileString() + "|" + (SALES_TAX/100 * getVehicleSold().getPrice()) + "|" + RECORDING_FEE + "|" + processingFee + "|" + getTotalPrice() + "|" + (isFinance() ? "YES|" : "NO|") + getMonthlyPayment();
    }
}
