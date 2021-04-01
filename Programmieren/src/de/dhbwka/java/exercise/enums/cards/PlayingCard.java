package de.dhbwka.java.exercise.enums.cards;

public class PlayingCard implements Comparable<PlayingCard>{
    public enum Suit {DIAMOND, HEART, SPADE, CLUBS}
    public enum CardValue{SEVEN, EIGHT, JACK, QUEEN, KING, TEN, ACE}

    private Suit suit;
    private CardValue cardValue;


    public PlayingCard(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }
    public String toString(){
        return suit.toString() + " "+ cardValue.toString();
    }

    public int compareTo(PlayingCard c){
        if (c.suit.ordinal() > this.suit.ordinal()) {
            return -1;
        } else if (c.suit.ordinal() < this.suit.ordinal()) {
            return 1;
        } else {
            if (c.cardValue.ordinal() > this.cardValue.ordinal()) {
                return -1;
            } else if (c.cardValue.ordinal() < this.cardValue.ordinal()) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public Suit getSuit() {
        return suit;
    }
    public CardValue getCardValue() {
        return cardValue;
    }
} 
