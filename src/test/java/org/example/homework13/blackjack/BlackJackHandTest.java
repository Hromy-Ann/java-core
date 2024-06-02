package org.example.homework13.blackjack;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BlackJackHandTest {

    @Test
    void getCards() {
        BlackJackHand hand = new BlackJackHand();
        List<Card> cards = hand.getCards();
        assertTrue(cards.isEmpty());
    }

    @Test
    void getEmptyValue() {
        BlackJackHand hand = new BlackJackHand();
        int handValue = hand.getValue();
        assertEquals(0, handValue);
    }

    @Test
    void getValue() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.CLUBS, Rank.KING));
        int handValue = hand.getValue();
        assertEquals(10, handValue);
    }

    @Test
    void isBusted() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.CLUBS, Rank.KING));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.KING));
        hand.addCard(new Card(Suit.HEARTS, Rank.KING));
        assertTrue(hand.isBusted());
    }

    @Test
    void isNotBusted() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.CLUBS, Rank.FIVE));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.SIX));
        assertFalse(hand.isBusted());
    }

    @Test
    void isNotBusted21() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.CLUBS, Rank.FIVE));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.SIX));
        hand.addCard(new Card(Suit.HEARTS, Rank.KING));
        assertFalse(hand.isBusted());
    }

    @Test
    void isNotBlackJack() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.CLUBS, Rank.FIVE));
        hand.addCard(new Card(Suit.DIAMONDS, Rank.SIX));
        hand.addCard(new Card(Suit.HEARTS, Rank.KING));
        assertFalse(hand.isBlackJack());
    }

    @Test
    void isBlackJack() {
        BlackJackHand hand = new BlackJackHand();
        hand.addCard(new Card(Suit.DIAMONDS, Rank.ACE));
        hand.addCard(new Card(Suit.HEARTS, Rank.KING));
        assertTrue(hand.isBlackJack());
    }

    @Test
    void addCard() {
        BlackJackHand hand = new BlackJackHand();
        Card card = new Card(Suit.CLUBS, Rank.FIVE);
        hand.addCard(card);
        List<Card> cards = hand.getCards();
        assertFalse(cards.isEmpty());
        assertEquals(card, cards.getFirst());
    }

    @Test
    void testToString() {
        BlackJackHand hand = new BlackJackHand();
        Card card = new Card(Suit.SPADES, Rank.FIVE);
        hand.addCard(card);
        String result = hand.toString();
        assertEquals("[FIVE of SPADES]", result);
    }
}