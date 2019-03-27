import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Dealer dealerHand = new Dealer();
        Player playerHand = new Player();
        Scanner sc = new Scanner(System.in);
        String input;

        deck.shuffle();

        for (int i = 0; i < 2; i++) {
            dealerHand.add(deck.pop());
            playerHand.add(deck.pop());
        }

        // prints dealer's hand except face down card
        dealerHand.printHiddenHand();

        // prints player's hand
        playerHand.printHand();

        //asks for hit
        while (playerHand.getTotal() <= 21 && playerHand.size() < 5) {
            System.out.println("\nWould you like another Card? (y/n)");
            input = sc.nextLine();

            System.out.println(input);

            if (input.equals("y") || playerHand.getTotal() < 21) {
                playerHand.add(deck.pop());
                System.out.println();
                playerHand.printHand();
            } else if (playerHand.getTotal() > 21) {
                System.out.println("You have busted.  Try again.");
            } else if (playerHand.getTotal() == 21) {
                System.out.println("Blackjack!");
            } else {
                break;
            }
        }


        if (playerHand.getTotal() <= 21 && playerHand.size() < 5) {
            System.out.println("\n*****DEALER PLAYS*****");
            dealerHand.printHiddenHand();

        }
    }
}