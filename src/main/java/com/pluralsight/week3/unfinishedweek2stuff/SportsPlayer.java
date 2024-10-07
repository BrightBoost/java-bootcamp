package com.pluralsight.week3.unfinishedweek2stuff;

// everything that's not in the same package or in the java.lang package has to be imported
import java.time.LocalDate;
import java.util.Arrays;

public class SportsPlayer {
    private String name;
    private String[] sports;
    private LocalDate dob;
    private String gender;
    private int jNumber;
    private String catchPhrase;

    public SportsPlayer() { }

    public SportsPlayer(String name, String[] sports, LocalDate dob, String gender, int jNumber, String catchPhrase) {
        this.name = name;
        this.sports = sports;
        this.dob = dob;
        this.gender = gender;
        this.jNumber = jNumber;
        this.catchPhrase = catchPhrase;
    }

    public void saySomethingAfterGame(boolean win) {
        if(win) {
            System.out.println("Suiiii " + catchPhrase);
        } else {
            System.out.println("No");
        }
    }

    public void saySomethingAfterGame() {
        System.out.println(catchPhrase);
    }

    public void describeSportsPlayer() {
        // create a sports string
        System.out.println(name + " born on " + dob + " is good at " + Arrays.toString(sports));
    }

    @Override
    public String toString() {
        return "SportsPlayer{" +
                "name='" + name + '\'' +
                ", sports=" + Arrays.toString(sports) +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", jNumber=" + jNumber +
                ", catchPhrase='" + catchPhrase + '\'' +
                '}';
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
