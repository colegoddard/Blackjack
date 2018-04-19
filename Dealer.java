import java.util.ArrayList;
public class Dealer extends Player {
    private ArrayList<Card> dealerHand;
    public Dealer() {
        super("Dealer", 100);
        dealerHand = new ArrayList<Card>();
        
    }
    
    public String toString() {
        String output = "The dealer has: \n";
        
        for(Card c : hand) {
            output += c.toString() + "\n";
        }
        return output;
    }
}
