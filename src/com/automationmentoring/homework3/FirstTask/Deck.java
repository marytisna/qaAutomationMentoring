package com.automationmentoring.homework3.FirstTask;

public class Deck {

    private Card[] cards;

    private int currentIndex = 0;
    private int backwardIndex;

    public Deck() {
        cards = new Card[Card.ranks.length * Card.suits.length];
        int index = 0;
        for (int suit = 0; suit < Card.suits.length; suit++) {
            for (int rank = 0; rank < Card.ranks.length; rank++) {
                cards[index++] = new Card(rank, suit);
            }
        }
        backwardIndex = cards.length - 1;
    }

    public Card getCard() {
        return cards[currentIndex++];
    }

    boolean hasNext() {
        return currentIndex < cards.length;
    }

    public Card getCardBackwards() {
        return cards[backwardIndex--];
    }

    boolean hasPrevious() {
        return backwardIndex > -1;
    }
}
