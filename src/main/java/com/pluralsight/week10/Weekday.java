package com.pluralsight.week10;

public enum Weekday {
    MONDAY("weekday"),
    TUESDAY("weekday"),
    WEDNESDAY("weekday"),
    THURSDAY("weekday"),
    FRIDAY("weekday"),
    SATURDAY("weekend"),
    SUNDAY("weekend");

    private String dayType;

    public String getDayType() {
        return dayType;
    }

    Weekday(String dayType) {
        this.dayType = dayType;
    }


}
