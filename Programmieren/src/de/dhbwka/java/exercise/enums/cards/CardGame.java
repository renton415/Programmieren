package de.dhbwka.java.exercise.enums.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.dhbwka.java.exercise.enums.cards.PlayingCard.CardValue;
import de.dhbwka.java.exercise.enums.cards.PlayingCard.Suit;

public class CardGame {
    private List<PlayingCard> deck = new ArrayList<>();

    CardGame(){
        for (Suit s : Suit.values()){
            for (CardValue cv : CardValue.values()){
                this.deck.add(new PlayingCard(s, cv));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(this.deck);
    }
    public void sort() {
        Collections.sort(this.deck);
    }
    public PlayingCard get(){
        if ( this.deck.isEmpty() ) { 
            return null; 
         } 
         return this.deck.remove( 0 );
    }
    public List<PlayingCard> all() {
        return this.deck;
    }
    
}
