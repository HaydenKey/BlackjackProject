public class Card {
    private Suit.suit suit;
    private Value.value value;

    public Card(Suit.suit cardSuit, Value.value cardValue) {
         suit = cardSuit;
         value = cardValue;
    }

    public Value.value getValue() {
        return this.value;
    }

    public Suit.suit getSuit() {
        return this.suit;
    }

    public int valueToInt(int handValue) {
        switch (this.getValue()) {
            case ACE:
                if (handValue >= 11) {
                    return 1;
                } else {
                    return 11;
                }
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            case TEN:
                return 10;
            case JACK:
                return 10;
            case QUEEN:
                return 10;
            case KING:
                return 10;
            default:
                System.out.println("Shouldn't get here");
                return 0;
        }
    }
}