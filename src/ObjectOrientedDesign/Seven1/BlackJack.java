package ObjectOrientedDesign.Seven1;

import java.util.ArrayList;

import static java.lang.System.exit;

/**
 * Created by radha on 10/15/16.
 */
public class BlackJack {
    Deck deck;
    ArrayList<Player> players;
    boolean win = false;
    public void play() {
        System.out.println("How many players?");
        int numOfPlayers = 2;
        deck = new Deck();
        players = new ArrayList<>();
        addPlayers(numOfPlayers);
        while (!win) {
            for (Player player : players) {
//                String response = player.respond();
//                switch ()
            }
        }

    }

    private void replayOrExit() {
        System.out.println("Would you like to play again?");
        String answer = "Y";
        while (answer != "Y" || answer != "N") {
            switch (answer.toUpperCase()) {
                case "Y":
                    play();
                    break;
                case "N":
                    exit(0);
                    break;
                default:
                    System.out.println("Unrecognized input");
            }
        }

    }


    private void addPlayers(int numOfPlayers) {
        for (int i = 0; i <= numOfPlayers; i++) {
            Hand newHand = new Hand(deck.dealCard(), deck.dealCard());
            Player newPlayer = new Player(newHand);
            players.add(newPlayer);
        }
    }


    public static void main(String [] args) {
        BlackJack game = new BlackJack();
        game.play();
    }


}
