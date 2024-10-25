package com.pluralsight.week5.cardblackjack;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
        game.playGame();
        game.pickWinner();
    }
}
