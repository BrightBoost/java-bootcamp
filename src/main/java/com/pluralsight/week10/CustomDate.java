package com.pluralsight.week10;

public class CustomDate {
    // day of the week
    private Weekday dayOfTheWeek;
    // day of the month
    private int dayOfTheMonth;
    // month
    private Month month;
    // year
    private int year;

    public Weekday getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(Weekday dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public int getDayOfTheMonth() {
        return dayOfTheMonth;
    }

    public void setDayOfTheMonth(int dayOfTheMonth) {
        this.dayOfTheMonth = dayOfTheMonth;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
