package com.pluralsight.week3.unfinishedweek2stuff;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        SportsPlayer theGoat = new SportsPlayer();
        theGoat.setName("Messi");
        theGoat.setDob(LocalDate.of(1987, 6, 24));
        theGoat.setjNumber(13);
        theGoat.setCatchPhrase("anda pasha bobo");
        theGoat.setGender("male");
        theGoat.setSports(new String[]{"soccer"});

        SportsPlayer theGoat1 = new SportsPlayer();
        theGoat1.setName("Ronaldo");
        theGoat1.setDob(LocalDate.of(1985, 4, 20));
        theGoat1.setjNumber(7);
        theGoat1.setCatchPhrase("suiiiii");
        theGoat1.setGender("male");
        theGoat1.setSports(new String[]{"soccer"});

        theGoat.saySomethingAfterGame(true);
        theGoat.saySomethingAfterGame(false);
        System.out.println("*********");
        theGoat1.saySomethingAfterGame(true);
        theGoat1.saySomethingAfterGame(false);

    }
}
