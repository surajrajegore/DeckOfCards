package com.bridgelabz.deckcard;

public class DeckOfCards {
    static final int numOfPlayers = 4;
    static final int numOfCardsDistribute = 9;
    public static void main(String[] args) {
        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
        shuffle(SUITS, RANKS);
    }

    public static void shuffle(String[] SUITS, String[] RANKS) {
        int[][] array = new int[SUITS.length][RANKS.length];
        int totalCards = SUITS.length * RANKS.length;
        String[] deck = new String[totalCards];
        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                System.out.println(deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j]);
            }
        }

        for (int i = 0; i < totalCards; i++) {
            int random = i + (int) (Math.random() * (totalCards - i));
            String temp = deck[random];
            deck[random] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < numOfPlayers; i++){
            array[i][0] = i + 1;
            System.out.println("\n --> Player  " + array[i][0]+"\n");
            for (int j = 0; j < numOfCardsDistribute; j++) {
                System.out.println(deck[i + j * numOfPlayers]);
            }
        }
    }
}
