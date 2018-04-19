public class Card {
    private String suit;
    private String rank;
    public int value;
    
    public Card(String st, String rnk, int val) {
        suit = st;
        rank = rnk;
        value = val;
    }

    public String getSuit() {
        return this.suit;
    }
    
    public String getRank() {
        return this.rank;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public String toString() {
        return "Rank: " + rank + ", Suit: " + suit + ", Value " + value;
    }   
}
