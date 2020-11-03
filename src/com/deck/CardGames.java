package com.deck;

import java.util.ArrayList;

public interface CardGames {
    void startGame();
    void enterName();
    ArrayList<Card> createDeck();
    void shuffleDeck(ArrayList<Card> x);
    void drawHand(int deckCard);
    void drawCard();
    void endTurn();
    void endGame();
}
