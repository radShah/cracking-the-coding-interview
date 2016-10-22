package ObjectOrientedDesign.Seven1;

import java.util.ArrayList;

/**
 * Created by radha on 10/15/16.
 */
public class Hand {
    ArrayList<Card> cards;

    public Hand(Card card1, Card card2) {
        cards = new ArrayList<Card>();
        cards.add(card1);
        cards.add(card2);
    }

    public int getSum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getValue();
        }
        return sum;
    }

}
