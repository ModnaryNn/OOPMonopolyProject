package gamefunction;

import java.util.ArrayList;
import java.util.List;

public class GameHandler {

    public Dice dice;
    public int turnCount;
    public int playerTurn = 0;
    public List<Player> players = new ArrayList<>();

    //CONSTRUCTOR
    public GameHandler() {
        dice = new Dice(2);
        playerTurn = 1;
    }

    //METHODS

    public void setNumberOfPlayers(int number) {
        players.clear();
        for (int i = 0; i < number; i++) {
            Player player = new Player("Player " + (i + 1));
            players.add(player);
        }
    }

    public Player getCurrentPlayer() {
        return players.get(playerTurn);
    }


}
