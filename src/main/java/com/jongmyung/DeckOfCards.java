package com.jongmyung;
/*
    Standard 52 playing card deck
    https://en.wikipedia.org/wiki/Standard_52-card_deck

    There are 52 cards in a standard deck. Each card belongs to one of four suits and one of 13 ranks.
    The suits are Spades, Hearts, Diamonds, and Clubs.
    The ranks are Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, and King.
*/

public class DeckOfCards {
    // Total cards 52 in the deck
    public static final int NumberOfCards = 52;

    // Shuffle 26 times
    private static final int ShuffleCount = 26;

    // Initialize array of Card object
    private final Card[] deckOfCards;

    // Current Card
    private int currentCard;

    // Initialize 52 cards
    public DeckOfCards() {
        // Create Array size 52
        deckOfCards = new Card[NumberOfCards];

        // Initialize all 52 card objects in the created array
        // Valid suit value is 0 to 3 and rank value is 1 to 13
        int i = 0;
        for (int suit = 0; suit < 4; suit++)
            for (int rank = 1; rank <= 13; rank++)
                deckOfCards[i++] = new Card(rank, suit);

        // Set card draw counter 0
        currentCard = 0;
    }

    // Deck shuffle
    // Random pick two card from deck and swap 26 times.
    public void shuffle() {
        int card1, card2;

        for (int i = 0; i < ShuffleCount; i++) {
            card1 = (int) (NumberOfCards * Math.random());  // Pick 2 random cards
            card2 = (int) (NumberOfCards * Math.random());  // in the deck

            // Swap these randomly picked cards
            Card tmp = deckOfCards[card1];
            deckOfCards[card1] = deckOfCards[card2];
            deckOfCards[card2] = tmp;
        }

        // Reset card draw counter
        currentCard = 0;
    }

    // Deal one card from the deck
    // Return top card from the deck and increase index number
    // When all 52 cards are drew return null and print a message
    public Card dealOneCard() {
        Card draw = null;

        if (currentCard < NumberOfCards) {
            draw = deckOfCards[currentCard];
            currentCard++;
        } else {
            System.out.println("Deck is empty");
        }

        return draw;
    }

    // Convert object to String
    public String toString() {
        String s = "";
        for (int i = 0; i < NumberOfCards; i++) {
            s += deckOfCards[i] + "\n";
        }
        return s;
    }
}
