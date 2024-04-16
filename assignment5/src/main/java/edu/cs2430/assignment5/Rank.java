package edu.cs2430.assignment5;

public enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;
    @Override public String toString() {
        return switch (this) {
            case ACE -> "ace";
            case TWO -> "two";
            case THREE -> "three";
            case FOUR -> "four";
            case FIVE -> "five";
            case SIX -> "six";
            case SEVEN -> "seven";
            case EIGHT -> "eight";
            case NINE -> "nine";
            case TEN -> "ten";
            case JACK -> "jack";
            case QUEEN -> "queen";
            case KING -> "king";
            default -> "you messed up dumbass";
        };
    }
}
