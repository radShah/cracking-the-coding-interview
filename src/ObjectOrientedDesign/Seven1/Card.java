package ObjectOrientedDesign.Seven1;

/**
 * Created by radha on 10/15/16.
 */
public abstract class Card {


    private Suit suit;
    private int value;

    public Card(Suit suit) {
        this.suit = suit;
    }

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
    }


    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
