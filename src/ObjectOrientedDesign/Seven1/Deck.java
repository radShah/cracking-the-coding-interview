package ObjectOrientedDesign.Seven1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by radha on 10/15/16.
 */
public class Deck {

    List<Card> deck;
    int dealPoint = 0;

    public Deck() {
        deck = new ArrayList();
        createDeck();
    }

    private void createDeck() {
        for (Suit suit : Suit.values()) {
            // Create all number cards - 36 cards
            for (int i = 2; i <= 10; i++) {
                deck.add(new NumberCard(suit, i));
            }
            // Create face cards - 12 cards
            for (FaceType faceType :FaceType.values()) {
                deck.add(new FaceCard(suit));
            }
            // Create Ace Cards - 4 cards
            deck.add(new AceCard(suit, Integer.MAX_VALUE));
        }
    }

    protected Card dealCard() {
        return deck.remove(++dealPoint);
    }

}
