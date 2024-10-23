package com.pluralsight.week5;

import java.util.List;

public class Product {
    private String id;
    private double stock;
    private String name;
    private String description;
    private String productCode;

    public Product(String id, double stock, String name, String description, String productCode) {
        this.id = id;
        this.stock = stock;
        this.name = name;
        this.description = description;
        this.productCode = productCode; //65-BLA-909f
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    // methods
    public int getSupplierCode() {
        return Integer.parseInt(this.productCode.substring(0, this.productCode.indexOf("-")));
    }

    public boolean placeOrder(double amount) {
        if(amount < this.stock) {
            System.out.println("Order has been placed!");
            this.stock = this.stock - amount;
            return true;
        } else {
            System.out.println("Oh oh, we don't have " + amount + " of " + this.name);
            return false;
        }
    }

    public void placeOrder(List<Double> amounts) {
        for(double amount: amounts) {
            placeOrder(amount);
        }
    }
}
