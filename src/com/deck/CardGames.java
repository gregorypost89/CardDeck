package com.deck;

import java.util.ArrayList;

public interface CardGames {
    void startGame();
    void enterName();
    void shuffleDeck(ArrayList<Card> x);
    ArrayList<Card> createDeck();
    void deal();
    void drawCard();
    void endTurn();
    void endGame();
}
