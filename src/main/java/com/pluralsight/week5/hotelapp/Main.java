package com.pluralsight.week5.hotelapp;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(4, 150, false, false);
        System.out.println(room.isAvailable());

        Reservation reservation = new Reservation("queen", 3, true);
        System.out.println(reservation.getReservationTotal());

        Employee employee = new Employee(1, "Adrian", "IT", 50, 45);
        System.out.println(employee.getTotalPay());
        System.out.println(employee.getOvertimeHours());
        System.out.println(employee.getRegularHours());
    }
}
