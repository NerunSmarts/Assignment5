package edu.cs2430.assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class CardGroup {
    private List<Card> cardList;

    public CardGroup() {
        cardList = new ArrayList<Card>();
    }

    public CardGroup(CardGroup otherCardGroup) {
        cardList = new ArrayList<Card>();
        for (Card card : otherCardGroup.cardList) {
            cardList.add(new Card(card));
        }
    }

    public void addCard(Card card) {
        cardList.add(card);
    }

    public void clear() {
        cardList.clear();
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
        CardGroup otherCardGroup = (CardGroup) other;
        return cardList.equals(otherCardGroup.cardList);
    }

    public Card getCard(int index) {
        return cardList.get(index);
    }

    public Card getLastCard() {
        return cardList.get(cardList.size() - 1);
    }

    public int hashCode() {
        return cardList.hashCode();
    }

    public boolean isEmpty() {
        return cardList.isEmpty();
    }

    public Card removeCard(int index) {
        return cardList.remove(index);
    }

    public Card removeLastCard() {
        return cardList.remove(cardList.size() - 1);
    }

    public void shuffle(Random random) {
        int n = cardList.size();
        for (int i = 0; i < n - 1; i++) {
            int j = random.nextInt(i + 1);
            Card temp = cardList.get(i);
            cardList.set(i, cardList.get(j));
            cardList.set(j, temp);
        }
    }

    public int size() {
        return cardList.size();
    }

    public void sort() {
        if (cardList.isEmpty() == false) {
            Collections.sort(cardList, (Card card1, Card card2) -> card1.compareTo(card2));
        }
    }

    @Override public String toString() {
        String output = "";
        for (Card card : cardList) {
            if (cardList.indexOf(card) == cardList.size() - 1) {
                output += card.toString();
            } else {
                output += card.toString() + "\n";
            }
        }
        return output;
    }


}