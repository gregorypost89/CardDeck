package com.deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PokerGame implements CardGames {

    private int myHand;

    public PokerGame(int gameNumber) {
    }

    @Override
    public void startGame() {
        System.out.println("Poker started.");
        // Need to store a deck here from createDeck()
        // TODO: determine best method to store deck
        List<Card> deck = null;
    }

    @Override
    public void enterName() {
        // Provides input for player name
        // TODO: Store player name (return, assign)
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter your name:");

        String playerName = inputName.nextLine();
        System.out.println("Welcome, " + playerName + "!");
    }

    @Override
    public List<Card> createDeck() {
        // TODO Revisit return statements, test functionality
        List<Card> deck = new ArrayList<>();
        List<String> rankList = Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King");
        List<String> suitList = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
        for (String rank : rankList) {
            for (String suit : suitList) {
                System.out.println(rank + " of " + suit);
                deck.add(Card.createCard(rank, suit));
                return deck;
            }
        }
        return deck;
    }


    @Override
    public void drawHand(int deckCard) {
        // Draws set number of cards
        // Unavailable after starting game (turn 0/1 action only)
        // TODO: Draw five cards for poker
        // TODO: Make unavailable after starting game
        // TODO: Automatic functionality?
        System.out.println("Drawing " + deckCard + " cards from the deck");
        System.out.println("I have " + deckCard + "cards in my hand");
    }

    @Override
    public void drawCard() {
        // Draws a single card
        // TODO: Implement
        System.out.println("drawCard not implemented");
    }

    @Override
    public void endTurn() {
        // Ends player turn
        // TODO: Implement
        System.out.println("endTurn not implemented");
    }

    @Override
    public void endGame() {
        // Ends game, returns back to main menu
        // TODO: Implement
        System.out.println("endGame not implemented");
    }
}
