import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;
    private int total;
    private int size;

    public Player() {
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

    public int getTotal() {
        return total;
    }

    public int size() {
        return size;
    }

    public void printHand() {
        System.out.println("Your Hand: ");

        for (int i = 0; i < hand.size(); i++) {
            System.out.println("\t" + hand.get(i).getValue() + " OF " + hand.get(i).getSuit());
        }

        System.out.println("Hand Total: " + total);
    }
}