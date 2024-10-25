package com.pluralsight.week5.cardblackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    // players
    private ArrayList<Player> players;
    private Scanner scanner;
    private Deck deck;

    public Game() {
        players = new ArrayList<>();
        scanner = new Scanner(System.in);
        deck = new Deck();
        deck.shuffle();
    }

    // game start
    public void startGame() {
        // loop to get the players
        boolean morePlayers = true;
        while(morePlayers) {
            addPlayer();
            if(players.size() >= 2) {
                System.out.println("Do you want to add more players? y / n");
                morePlayers = !scanner.nextLine().equalsIgnoreCase("n");
            }
        }
    }

    public void playGame() {
        // for every player deal 2 cards to their hand
        for(Player p : players) {
            p.getHand().deal(deck.deal());
            p.getHand().deal(deck.deal());
        }

    }

    public void pickWinner() {
        Player winner = players.get(0);
        for(Player p: players) {
            System.out.println(p.getName() + "'s cards:");
            p.getHand().displayHand();
            if(Math.abs(p.getHand().getValue() - 21) < Math.abs(winner.getHand().getValue() - 21)) {
                winner = p;
            }
        }
        System.out.println(winner.getName() + " won!!");

    }

    public void addPlayer() {
        System.out.println("What is the name of player" + (players.size() + 1) + "?");
        String name = scanner.nextLine();
        players.add(new Player(name, new Hand()));
    }

    // game logic

    // game end
}
