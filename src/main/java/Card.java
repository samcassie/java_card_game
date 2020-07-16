import java.util.Arrays;

public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public RankType getRank(){
        return this.rank;
    }

    public String toString(){
        return (this.rank.getValue() + " of " + this.suit.getValue());
    }

    public int getValueFromEnum(){
        return this.rank.getValue();
    }

}
