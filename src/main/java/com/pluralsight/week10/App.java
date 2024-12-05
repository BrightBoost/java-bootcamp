package com.pluralsight.week10;

public class App {
    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        customDate.setDayOfTheMonth(5);
        customDate.setMonth(Month.DEC);
        customDate.setYear(2024);
        customDate.setDayOfTheWeek(Weekday.THURSDAY);

        if(customDate.getMonth() == Month.DEC){
            System.out.println("The month is December");
        }

        System.out.println(Month.DEC.ordinal());

        System.out.println(customDate.getDayOfTheWeek().getDayType());

        switch (customDate.getMonth()) {
            case JAN, FEB, DEC:
                System.out.println("winter");
                break;
            case APR, MAY, JUN:
                System.out.println("spring!");
                break;
        }

    }
}
