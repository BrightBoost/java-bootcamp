package com.pluralsight.week5;


//LastName, Prefix FirstName MiddleName, Suffix
//Johnson, Dr. Mel B, PhD
//Johnson, Mel B, PhD

import java.security.InvalidParameterException;

public class NameFormatter {
    private NameFormatter() {}

    //Johnson, Mel
    public static String format(String firstName, String lastName){
        return lastName + ", " + firstName;
    }

    //LastName, Prefix FirstName MiddleName, Suffix
    //Johnson, Dr. Mel B, PhD
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return lastName + " " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }
    public static String format(String fullname) {
        if(fullname == null) {
            return null;
        }

        String[] nameParts = fullname.split(" ");
        if (nameParts.length == 2) {
            return format(nameParts[0], nameParts[1]);
        } else if (nameParts.length == 3) { // fn mn ln
            return nameParts[2] + ", " + nameParts[0] + " " + nameParts[1];
        } else if (nameParts.length == 4) { // fn mn ln
            return nameParts[2] + " " + nameParts[0] + " " + nameParts[1] + ", " + nameParts[3];
        } else if(nameParts.length == 5) {
            return format(nameParts[0], nameParts[1], nameParts[2], nameParts[3], nameParts[4]);
        } else {
            throw new InvalidParameterException();
        }
    }
}
