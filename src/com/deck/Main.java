package com.deck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CardGames myFirstGame;
        myFirstGame = new PokerGame();
        myFirstGame.startGame();
        myFirstGame.enterName();
        myFirstGame.createDeck();
        myFirstGame.deal();
    }
}
