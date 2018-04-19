import java.util.Scanner;
public class Game {
    Player player;
    Dealer dealer = new Dealer();
    Deck deck;
    Scanner scan;
    public Game() {
        scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = scan.next();
        System.out.println("How much money do you have?");
        int m = scan.nextInt();
        player = new Player(n, m);
        deck = new Deck();
    }

    public void playGame() {
        for (int c = 0; c < 2; c++) {
            Card temp = deck.deal();
            player.hit(temp);
        }
        
        while (!player.stay()) {
            Card temp = deck.deal();
            player.hit(temp);
        }
        System.out.println(player);
        
        while (dealer.getHandTotal() < 17) {
            Card temp = deck.deal();
            dealer.hit(temp);
        }
        System.out.println(dealer);
        System.out.println(determineWinner());
        
    }
    
    public String determineWinner() {
        if (dealer.getHandTotal() > 21) {
            return "You Won!";
        }
        else if (player.getHandTotal() > dealer.getHandTotal() && player.getHandTotal() <= 21){
            return "You Won!";
        }
        else if (dealer.getHandTotal() > player.getHandTotal() && dealer.getHandTotal() <= 21) {
            return "The Dealer Won.";
        }
        else {
            return "You tied.";
        }
    }
    
}
