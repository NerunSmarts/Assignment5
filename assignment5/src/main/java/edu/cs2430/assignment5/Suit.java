package edu.cs2430.assignment5;

public enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;
    
   @Override public String toString() {
        return switch (this) {
            case CLUBS -> "clubs";
            case DIAMONDS -> "diamonds";
            case HEARTS -> "hearts";
            case SPADES -> "spades";
            default -> "you broke it dumbass";
        };
    }
}


