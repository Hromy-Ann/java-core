package org.example.homework13.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void getSuit() {
        Card card = new Card(Suit.HEARTS, Rank.TEN);
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    void getRank() {
        Card card = new Card(Suit.HEARTS, Rank.TEN);
        assertEquals(Rank.TEN, card.getRank());
    }

    @Test
    void testToString() {
        Card card = new Card(Suit.HEARTS, Rank.TEN);
        assertEquals("TEN of HEARTS", card.toString());
    }
}