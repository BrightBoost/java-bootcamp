package com.pluralsight.week6.assetmanager;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue(){
        double result = 0;
        switch(this.condition) {
            case 1: // excellent
                result = 180 * squareFoot;
                break;
            case 2:
                result = 130 * squareFoot;
                break;
            case 3:
                result = 90 * squareFoot;
                break;
            case 4:
                result = 80 * squareFoot;
                break;
        }
        result += 0.25 * squareFoot * lotSize;
        return result;

    }
}
