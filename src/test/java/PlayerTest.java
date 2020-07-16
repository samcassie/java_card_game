import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    Deck deck1;
    Player player;


    @Before
    public void before() {
        deck1 = new Deck();
        player = new Player("Niall");
        deck1.addCards();
        deck1.shuffleCards();
    }

    @Test
    public void canTakeAddCard() {
        deck1.dealCard(player);
        deck1.dealCard(player);
        assertEquals(2, player.getHand().size());
        assertEquals(50, deck1.getCards().size());
    }

    @Test
    public void canCountCards() {

        deck1.addCards();
        deck1.shuffleCards();
        deck1.dealCard(player);
        deck1.dealCard(player);
        assertEquals(true, player.cardCount() > 0);
    }
}
