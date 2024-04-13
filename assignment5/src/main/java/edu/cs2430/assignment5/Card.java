package edu.cs2430.assignment5;

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(Card otherCard) {
        this.rank = otherCard.rank;
        this.suit = otherCard.suit;

    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String toString() {
        return rank.toString() + " of " + suit.toString();
    }

    public int hashCode() {
        return rank.hashCode() + suit.hashCode();
    }

    
}
