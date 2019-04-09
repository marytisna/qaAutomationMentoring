package com.automationmentoring.homework3.FirstTask;

public class Card {
    private int rank;
    private int suit;
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public static String[] suits = {"Diamonds", "Clubs", "Hearts", "Spades"};
    public static String[] ranks = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    public String toString()
    {
        return ranks[rank] + " of " + suits[suit];
    }
}
