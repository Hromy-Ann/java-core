package org.example.homework13.blackjack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    void drawCard() {
        Deck deck = new Deck();
        Card card = deck.drawCard();
        assertEquals(Rank.TWO, card.getRank());
        assertEquals(Suit.CLUBS, card.getSuit());
    }

    @Test
    void shuffle() {
        Deck deck = new Deck();
        List<Card> originalCards = new ArrayList<>(deck.getCards());
        deck.shuffle();
        List<Card> shuffledCards = deck.getCards();
        assertEquals(originalCards.size(), shuffledCards.size(),
                "The size of the deck should remain unchanged");
        assertNotEquals(originalCards, shuffledCards,
                "The deck should be shuffled and not in original order");
        assertTrue(shuffledCards.containsAll(originalCards)
                        && originalCards.containsAll(shuffledCards),
                "The shuffled deck should contain all original cards");
    }

    @Test
    void size() {
        Deck deck = new Deck();
        assertEquals(52, deck.size());
        for (int i = 0; i < 20; i++) {
            deck.drawCard();
        }
        assertEquals(32, deck.size());
    }
}