package ObjectOrientedDesign.Seven1;

/**
 * Created by radha on 10/15/16.
 */
public class AceCard extends Card {

    public AceCard(Suit suit, int value) {
        super(suit, value);
    }


    public void setValue(int value) {
        if (value != 1 || value != 11) {
            System.out.println("Incorrect Ace value");
        }
    }
}
