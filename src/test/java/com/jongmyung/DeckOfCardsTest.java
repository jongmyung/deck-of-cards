package com.jongmyung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeckOfCardsTest {
    @Test
    public void ShuffleDeck() {
        DeckOfCards deckOfCards = new DeckOfCards();
        String deck1 = deckOfCards.toString();

        // Shuffle Deck
        deckOfCards.shuffle();

        Assertions.assertNotEquals(deck1, deckOfCards.toString());
    }

    @Test
    public void DrawAllCards() {
        DeckOfCards deckOfCards = new DeckOfCards();

        for (int i = 0; i < DeckOfCards.NumberOfCards; i++) {
            Assertions.assertNotNull(deckOfCards.dealOneCard());
        }

        Assertions.assertNull(deckOfCards.dealOneCard());

        deckOfCards.shuffle();

        for (int i = 0; i < DeckOfCards.NumberOfCards; i++) {
            Assertions.assertNotNull(deckOfCards.dealOneCard());
        }

        Assertions.assertNull(deckOfCards.dealOneCard());
    }
}
