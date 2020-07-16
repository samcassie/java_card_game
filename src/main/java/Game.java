import java.util.ArrayList;

public class Game {

    ArrayList<Player> players;
    Deck deck;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<Player>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public Player checkWinner(){
        Player winningPlayer = players.get(0);
        for (Player player: players){
            if(player.cardCount() > winningPlayer.cardCount()){
                winningPlayer = player;
            }
        }
        return winningPlayer;
    }
}
