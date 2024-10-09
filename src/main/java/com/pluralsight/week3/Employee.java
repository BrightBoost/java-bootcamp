package com.pluralsight.week3;

public class Employee {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public void display() {
        System.out.println(name + " worked for " + hoursWorked + " at rate " + payRate + ". This results in gross pay: " + calcGrossPay());
    }

    public String toCsvLine() {
        return employeeId + "|" + name + "|" + calcGrossPay() + "\n";
    }

    public double calcGrossPay() {
        return this.payRate * this.hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
