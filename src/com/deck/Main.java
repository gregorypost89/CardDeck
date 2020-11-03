package com.deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CardGames myFirstGame;
        myFirstGame = new PokerGame(7);
        myFirstGame.startGame();
        myFirstGame.enterName();
        myFirstGame.createDeck();

    }
}

//    List<String> rankList = Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
//            "Eight", "Nine", "Ten", "Jack", "Queen", "King");
//    List<String> suitList = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
//        for (String rank : rankList) {
//                for (String suit : suitList) {
//                System.out.println(rank + " of " + suit);
//                }
//                }
// Create the deck
// - will need a Deck.java
// shuffle the deck
// - need a shuffle method
// - need a physical deck to shuffle
// draw a card
// - will need a Card.java
// deal a hand