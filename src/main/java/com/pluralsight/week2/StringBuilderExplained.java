package com.pluralsight.week2;

public class StringBuilderExplained {
    public static void main(String[] args) {
        String s = "blabla";
        String s1 = s;
        s = "lala";

        String text = "Maaike has a weird idea of fun";
        String reverseText = "";
        for(int i  = 0; i < text.length(); i++) {
            reverseText += (char) text.charAt(text.length() - 1 - i);
        }
        System.out.println(reverseText);



    }
}
