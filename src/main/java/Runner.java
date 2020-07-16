import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {


        Deck deck = new Deck();
        deck.addCards();
        deck.shuffleCards();
        Game game = new Game(deck);


        Scanner capacity = new Scanner(System.in);
        String numOfPlayers;

        System.out.println("Number of players: ");
        numOfPlayers = capacity.nextLine();

        System.out.println("Number of player: " + Integer.parseInt(numOfPlayers));

        for (int i = 0; i < Integer.parseInt(numOfPlayers); ++ i){
            Scanner in = new Scanner(System.in);
            String userName;

            System.out.println("Enter name " + (i+1) +":");
            userName = in.nextLine();

            Player player = new Player(userName);
            game.addPlayer(player);

        }

        for (Player player: game.getPlayers()) {
            deck.dealCard(player);
            deck.dealCard(player);
            System.out.println(player.getName() + " was dealt " + player.printCards());
        }

        Player winningPlayer = game.checkWinner();

        System.out.println("The winner was " + winningPlayer.getName() +
                " with the hand of " + winningPlayer.printCards() + " Total = " +
                winningPlayer.cardCount() +".");

    }
}
