package com.deck;

import java.util.List;

public interface CardGames {
    void startGame();
    void enterName();
    List<Card> createDeck();
    void drawHand(int deckCard);
    void drawCard();
    void endTurn();
    void endGame();
}
