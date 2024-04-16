package edu.cs2430.assignment5;

import java.util.HashMap;
import java.util.Map;

public class Game41Utils {

    private static Map<Rank, Integer> rankToPointMap = new HashMap<>() {{
        put(Rank.ACE, 11);
        put(Rank.TWO, 2);
        put(Rank.THREE, 3);
        put(Rank.FOUR, 4);
        put(Rank.FIVE, 5);
        put(Rank.SIX, 6);
        put(Rank.SEVEN, 7);
        put(Rank.EIGHT, 8);
        put(Rank.NINE, 9);
        put(Rank.TEN, 10);
        put(Rank.JACK, 10);
        put(Rank.QUEEN, 10);
        put(Rank.KING, 10);
    }};

    public Game41Utils (){}

    public static int getPointValue(Rank rank) {
        return rankToPointMap.get(rank);
    }

    public static int calculateHandValue(CardGroup hand) {
        int Clubs = 0, Diamonds = 0, Hearts = 0, Spades = 0;
        for (int i = 0; i < hand.size(); i++) {
            switch (hand.getCard(i).getSuit()) {
                case CLUBS: Clubs += getPointValue(hand.getCard(i).getRank());
                break;
                case DIAMONDS: Diamonds += getPointValue(hand.getCard(i).getRank());
                break;
                case HEARTS: Hearts += getPointValue(hand.getCard(i).getRank());
                break;
                case SPADES: Spades += getPointValue(hand.getCard(i).getRank());
                break;
                default: break;
            }
            
        }
        int maxPoints = Math.max(Clubs, Math.max(Diamonds, Math.max(Hearts, Spades)));
        int totalPoints = maxPoints - (Clubs + Diamonds + Hearts + Spades - maxPoints);
        return totalPoints;
    }

    public static boolean isHandOver(CardGroup deck, int knockIndex, int currentTurnIndex) {
        if (deck.isEmpty()) {
            return true;
        }
        if (knockIndex != -1 && currentTurnIndex == knockIndex) {
            return true;
        }
        return false;
    }
}
