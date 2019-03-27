import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    public Deck() {
        for (Suit.suit cardSuit : Suit.suit.values()) {
            for (Value.value cardValue : Value.value.values()) {
                deck.add(new Card(cardSuit, cardValue));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(this.deck);
    }

    public Card pop() {
        Card popper = deck.get(0);
        deck.remove(0);
        return popper;
    }
}
