package com.pluralsight.week5.cardblackjack;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
        this.isFaceUp = false;
    }
    public String getSuit(){
    // only return the suit if the card is face up
        if(isFaceUp){
            return suit;
        } else {
            return "#";
        }
    }
    public String getValue(){
    // only return the value if the card is face up
        if(isFaceUp){
        // this is the string value of the card
        // i.e. A, K, Q, J, 10, 9 ...
            return value;
        } else {
            return "#";
        }
    }
    public int getPointValue(){
        // only return the value if the card is face up
        if(isFaceUp){
        // determine point value and return it
            if(value.equalsIgnoreCase("A")) {
                return 11;
            } else if(value.equalsIgnoreCase("K") || value.equalsIgnoreCase("J") || value.equalsIgnoreCase("Q")) {
                return 10;
            } else {
                return Integer.parseInt(value);
            }
        } else {
            return 0;
        }
    }
    public boolean isFaceUp(){
        return isFaceUp;
    }
    public void flip(){
        isFaceUp = !isFaceUp;
    }
}
