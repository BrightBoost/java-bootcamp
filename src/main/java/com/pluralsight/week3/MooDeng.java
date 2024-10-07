package com.pluralsight.week3;

public class MooDeng {
    private int age;
    private double height;
    private double weight;
    private boolean cute = true;
    private boolean mouthOpen = true;
    private String color;

    public void changeColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isCute() {
        return cute;
    }

    public void setCute(boolean cute) {
        this.cute = cute;
    }

    public boolean isMouthOpen() {
        return mouthOpen;
    }

    public void setMouthOpen(boolean mouthOpen) {
        this.mouthOpen = mouthOpen;
    }
}
