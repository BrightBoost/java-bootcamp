package com.pluralsight.week5.hotelapp;

public class Room {
    // 1 create attributes
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    // 2 generate getters and setters

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    // 3 generate constructor with all the attributes

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    // 4 write derived getters
    public boolean isAvailable() {
       //  return !occupied && !dirty; // short implementation
        if(!dirty && !occupied) {
            return true;
        } else {
            return false;
        }
    }

    // methods
    public void checkIn() {
        this.occupied = true;
        this.dirty = true;
    }

    public void checkout() {
        this.occupied = false;
    }

    public void cleanRoom() {
        this.dirty = false;
    }

}
