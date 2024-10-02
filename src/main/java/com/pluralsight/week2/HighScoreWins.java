package com.pluralsight.week2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // get the string
        String scoreInput = scanner.nextLine();

        // split in teams and scores part
        String[] teamsAndScores = scoreInput.split(Pattern.quote("|"));

        // split the teams part into teams array
        String [] teams = teamsAndScores[0].split(":");

        // split the scores part into scores array
        String[] scores = teamsAndScores[1].split(":");

        // convert the scores from string to int
        int team1score = Integer.parseInt(scores[0]);
        int team2score = Integer.parseInt(scores[1]);

        // check which score is bigger and print winner
        if(team1score > team2score) {
            System.out.println("Winner: " + teams[0]);
        } else if(team2score > team1score) {
            System.out.println("Winner: " + teams[1]);
        } else {
            System.out.println("Same score!");
        }
    }
}
