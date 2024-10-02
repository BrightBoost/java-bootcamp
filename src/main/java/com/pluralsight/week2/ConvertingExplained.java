package com.pluralsight.week2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConvertingExplained {
    public static void main(String[] args) {
        // casting - changing type
        int x = 3;
        int y = 2;
        System.out.println(x / (double) y);

        // converting strings - change it from string to another data type
        String nr = "5";
        // int z = (int) nr; // this cannot be done
        int z = Integer.parseInt(nr);
        System.out.println(z);

        String nr2 = "4.78";
        double a = Double.parseDouble(nr2);
        System.out.println(a);

        String bday = "2002-01-14";
        LocalDate bdayDate = LocalDate.parse(bday);
        System.out.println(bdayDate);

        // we want to convert a date looking like this: 2002 01 14
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy MM dd");
        String bday2 = "2002 01 15";
        LocalDate bdayDate2 = LocalDate.parse(bday2, dtf);
        System.out.println(bdayDate2);
    }
}
