package com.automationmentoring.homework3.FirstTask;

public class Test {

    public static void main(String[] args) {
        Deck deck = new Deck();
        while(deck.hasNext())
            System.out.println(deck.getCard().toString());
        System.out.println();
        while(deck.hasPrevious())
            System.out.println(deck.getCardBackwards().toString());
    }
}
