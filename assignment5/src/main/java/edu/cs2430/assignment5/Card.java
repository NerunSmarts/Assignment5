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

    public int compareTo(Card otherCard) {
        int suitComparison = this.suit.compareTo(otherCard.suit);
        boolean continueExec;
        switch (suitComparison) {
            case 0 -> continueExec = true;
            default -> continueExec = false;
        }
        if (continueExec) {
            return this.rank.compareTo(otherCard.rank);
        } else {
            return suitComparison;
        }
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        Card otherCard = (Card) other;
        return this.rank.equals(otherCard.rank) && this.suit.equals(otherCard.suit);
    }
}
