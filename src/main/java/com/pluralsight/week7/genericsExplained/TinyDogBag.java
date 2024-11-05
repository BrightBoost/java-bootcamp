package com.pluralsight.week7.genericsExplained;

public class TinyDogBag {
    private TinyDog content;
    private double storageCapacity;

    public TinyDog getContent() {
        return content;
    }

    public void setContent(TinyDog content) {
        this.content = content;
    }

    public double getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(double storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
