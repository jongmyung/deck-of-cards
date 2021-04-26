package com.jongmyung;

/*
   Card object value map to String

    Suit: 3 = Spade
          2 = Heart
          1 = Diamond
          0 = Club

    Rank: Ace = 1
          2 = 2
          ...
          Jack = 11
          Queen = 12
          King = 13
*/

public class Card {
    // Rank mapping
    private static final String[] Ranks = {null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    // Suit mapping
    private static final String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    private final int rank;
    private final int suit;

    // Initialize Card
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // Get Suit Name
    public String getSuit() {
        return Suits[this.suit];
    }

    // Get Rank
    public String getRank() {
        return Ranks[this.rank];
    }

    // Display card value in String
    // e.g. Ace of Spade
    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
