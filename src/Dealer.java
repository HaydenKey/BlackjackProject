import java.util.ArrayList;

public class Dealer {
    private ArrayList<Card> hand;
    private int total;
    private int size;

    public Dealer() {
        hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
        total += card.valueToInt(total);
        size++;
    }

    public Card get(int index) {
        return hand.get(index);
    }

    public int getHiddenTotal() {
        return total-hand.get(0).valueToInt(total);
    }

    public int getTotal() {
        return total;
    }

    public int size() {
        return size;
    }

    public void printHiddenHand() {
        System.out.println("\nDealer's Hand: ");

        System.out.println("\t***FACE DOWN***");
        for (int i = 1; i < hand.size(); i++) {
            System.out.println("\t" + hand.get(i).getValue() + " OF " + hand.get(i).getSuit());
        }
    }

    public void printRevealedHand() {
        System.out.println("\nDealer's Hand: ");

        for (int i = 1; i < hand.size(); i++) {
            System.out.println("\t" + hand.get(i).getValue() + " OF " + hand.get(i).getSuit());
        }
    }
}