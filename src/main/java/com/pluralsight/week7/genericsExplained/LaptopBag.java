package com.pluralsight.week7.genericsExplained;

public class LaptopBag {
    private Laptop content;
    private double storageCapacity;

    public Laptop getContent() {
        return content;
    }

    public void setContent(Laptop content) {
        this.content = content;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
