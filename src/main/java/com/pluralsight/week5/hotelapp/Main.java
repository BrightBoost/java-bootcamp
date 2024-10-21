package com.pluralsight.week5.hotelapp;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(4, 150, false, false);
        System.out.println(room.isAvailable());
    }
}
