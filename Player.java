import java.util.Scanner;
import java.util.ArrayList;

public class Player {
    private String name;
    private int amountOfMoney;
    private int betSize;
    public ArrayList<Card> hand;
    Scanner scan = new Scanner(System.in);
    
    public Player(String nm, int mny) {
        name = nm;
        amountOfMoney = mny;
        hand = new ArrayList<Card>();
    }
    
    public String toString() {
        String output = "Player has: \n";
        
        for(Card c : hand) {
            output += c.toString() + "\n";
        }
        return output;
    }
    
    public void bet() {
        betSize = scan.nextInt();
        if (betSize > amountOfMoney) {
            System.out.println("You don't have enough money to make this bet. Please make a new bet.");
            bet();
        }
        
    }
    
    public void hit(Card c) {
        hand.add(c);
    }
    
    public boolean stay() {
        if (this.getHandTotal() > 21) {
            System.out.println(this);
            System.out.println("You busted.");
            System.exit(0);
        }
        else {
            System.out.println(this);
        }
        System.out.println("Do you want to hit? (Yes or No)");
        String answer = scan.nextLine();
        if(answer.equals("Yes")) {
            return false;
        }
        else {
            return true;
        }
        
        
    }
    
    public int getHandTotal() {
        int handValue =0;
        for(Card c : hand) {
           handValue += c.getValue(); 
        
        }
        return handValue;
    }    
    
}
