import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    
    public Deck() {
        deck = new ArrayList<Card>();
        initializeDeck();
    }

    public void initializeDeck() {
        String suit = "";
        
        for (int s = 0; s < 4; s++) {
            if(s == 0) {
                suit = "Spades";
            }
            else if (s == 1) {
                suit = "Hearts";
            }
            else if (s == 2) {
                suit = "Clubs";
            }
            else if (s == 3) {
                suit = "Diamonds";
            }
            for (Integer i = 1; i < 14; i++) {
                if (i == 1) {
                    Card cardToAdd = new Card(suit, "Ace", 1);
                    deck.add(cardToAdd);
                }
                else if (i > 1 && i < 11) {
                    Card cardToAdd = new Card(suit, i.toString(), i);
                    deck.add(cardToAdd);
                }
                else if (i == 11) {
                    Card cardToAdd = new Card (suit, "Jack", 10);
                    deck.add(cardToAdd);
                }
                else if (i == 12) {
                    Card cardToAdd = new Card (suit, "Queen", 10);
                    deck.add(cardToAdd);
                }
                else if (i == 13) {
                    Card cardToAdd = new Card (suit, "King", 10);
                    deck.add(cardToAdd);
                }

            }
        
        }
    }
    
    public Card deal() {
        Random rand = new Random();
        int index = rand.nextInt(deck.size());
        return deck.remove(index);
        
    }
}
