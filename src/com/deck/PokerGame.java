package com.deck;

import java.util.*;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class PokerGame implements CardGames {

    ArrayList<Card> deck = new ArrayList<Card>();
    ArrayList<Card> myHand = new ArrayList<Card>();
    ArrayList<Card> opponentHand = new ArrayList<Card>();

    @Override
    public void startGame() {
        System.out.println("Poker started.");
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

    public ArrayList<Card> createDeck() {
        // TODO Revisit return statements, test functionality
        ArrayList<String> rankList = new ArrayList<String>(Arrays.asList("Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                "Eight", "Nine", "Ten", "Jack", "Queen", "King"));
        ArrayList<String> suitList = new ArrayList<String>(Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades"));
        for (String rank : rankList) {
            for (String suit : suitList) {
                deck.add(new Card(rank, suit));
            }
        }
        Collections.shuffle(deck);
        return deck;
    }

    @Override
    public void shuffleDeck(ArrayList<Card> x) {
        Collections.shuffle(x);
    }

    @Override
    public void deal() {
        Card playerCard = null;
        Card opponentCard = null;
        for (int i = 0; i < 5; i++) {
            playerCard = deck.get(0);
            opponentCard = deck.get(1);
            myHand.add(playerCard);
            opponentHand.add(opponentCard);
            deck.remove(0);
            deck.remove(0);
        }
        System.out.println("Player's hand: " + myHand);
        System.out.println("Opponent's hand: " + opponentHand);
    }

    @Override
    public void drawCard() {
        // For future implementation (example: Texas Hold Em)
        Card drawnCard = deck.get(0);
        System.out.println(drawnCard);
        myHand.add(drawnCard);
        deck.remove(0);
        System.out.println(myHand);
    }

    @Override
    public void endTurn() {
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

