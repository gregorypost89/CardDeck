package com.deck;

import java.util.*;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class PokerGame implements CardGames {

    private int myHand;

    public PokerGame(int gameNumber) {
    }

    @Override
    public void startGame() {
        System.out.println("Poker started. This is game number");
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
    public ArrayList<Card> createDeck() {
        // TODO Revisit return statements, test functionality
        ArrayList<Card> deck = new ArrayList<Card>();
        ArrayList<String> rankList = new ArrayList<String>(Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
        ArrayList<String> suitList = new ArrayList<String>(Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));
        for (String rank : rankList) {
            for (String suit : suitList) {
                //System.out.println(rank + " of " + suit);
                deck.add(Card.createCard(rank, suit));
            }
        }
        //System.out.println(deck.toString());
        Collections.shuffle(deck);
        System.out.println("Deck Order:");
        System.out.println(deck.toString());
        return deck;
    }

    @Override
    public void shuffleDeck(ArrayList<Card> x) {
        Collections.shuffle(x);
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

