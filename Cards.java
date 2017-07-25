import java.util.*;

/**
 * @author Kevin Mateo
 * @version 7/25/2017 This class creates Objects to create a deck of cards.
 */

public class Cards {
    
    /**
     * Enumeration of Card Values.
     */
    public enum CardValue {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(
                9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(14);

        private int cardValue;

        private CardValue(int value) {
            this.cardValue = value;
        }

        // getter method
        public int getCardValue() {
            return cardValue;
        }

    }

    // Enumeration of the different Suits
    public enum Suit {
        HEARTS, SPADES, CLUBS, DIAMONDS;
    }

    private Suit suit;

    private CardValue cardValue;

    // Constructor of Cards class
    public Cards(CardValue cardValue, Suit suit) {
        this.cardValue = cardValue;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }

    public class Deck {
        // arraylist of objects
        private ArrayList deck;

        public Deck() {
            this.deck = new ArrayList();
            // 12 different card values
            for (int i = 0; i < 13; i++) {
                CardValue value = CardValue.values()[i];
            }
            // 4 different Suits
            for (int j = 0; j < 4; j++) {
                Cards card = new Cards(cardValue, Suit.values()[j]);
                deck.add(card);
            }
        }

        public void shuffleDeck() {
            Collections.shuffle(deck);
        }

        public void dealOneCard() {
            // Iterator needed to run through enumerations
            Iterator cardIterator = deck.iterator();
            // while there is cards in deck
            while (cardIterator.hasNext()) {
                Cards aCard = (Cards) cardIterator.next();
                shuffleDeck();
                // prints out the specific card in the deck.
                System.out.println(aCard.getCardValue() + "of " + aCard.getSuit());
                //int size = deck.size();
                // subtracts the size of the deck.
                //size--;
            }
        }

    }
}

