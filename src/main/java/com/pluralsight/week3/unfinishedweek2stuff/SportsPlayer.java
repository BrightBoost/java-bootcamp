package com.pluralsight.week3.unfinishedweek2stuff;

// everything that's not in the same package or in the java.lang package has to be imported
import java.time.LocalDate;

public class SportsPlayer {
    private String name;
    private String[] sports;
    private LocalDate dob;
    private String gender;
    private int jNumber;
    private String catchPhrase;

    public void saySomethingAfterGame(boolean win) {
        if(win) {
            System.out.println("Suiiii " + catchPhrase);
        } else {
            System.out.println("No");
        }
    }

    public void describeSportsPlayer() {
        // create a sports string
        System.out.println(name + " born on " + dob + " is good at " + sports);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSports() {
        return sports;
    }

    public void setSports(String[] sports) {
        this.sports = sports;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getjNumber() {
        return jNumber;
    }

    public void setjNumber(int jNumber) {
        this.jNumber = jNumber;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }
}
