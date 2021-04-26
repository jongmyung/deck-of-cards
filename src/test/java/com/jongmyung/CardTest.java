package com.jongmyung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CardTest {
    @Test
    public void AceOfSpade() {
        Card card = new Card(1, 3);
        Assertions.assertEquals("Ace of Spades", card.toString());
    }

    @Test
    public void InvalidCardRank() {
        Card card = new Card(14, 1);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> card.getRank());
    }

    @Test
    public void InvalidCardSuit() {
        Card card = new Card(1, 4);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> card.getSuit());
    }
}
