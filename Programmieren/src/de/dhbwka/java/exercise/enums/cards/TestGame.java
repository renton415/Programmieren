package de.dhbwka.java.exercise.enums.cards;

import de.dhbwka.java.exercise.enums.cards.PlayingCard.CardValue;
import de.dhbwka.java.exercise.enums.cards.PlayingCard.Suit;

public class TestGame {
    public static void main(String[] args){
        CardGame cg = new CardGame();
        cg.shuffle();
        PlayingCard hSeven = new PlayingCard(Suit.HEART, CardValue.SEVEN);
        PlayingCard card= cg.get();
        for (int i = 0; i<10;i++){
            System.out.println( card + " verglichen mit " + 
            hSeven + ": " + card.compareTo( hSeven ) );
            card= cg.get();
        }
        cg.sort(); 
 
        System.out.println( "\u00DCbrige Karten sortiert:" ); 
        for ( PlayingCard cd : cg.all() ) { 
         System.out.println( cd ); 
        }
    }   
}
