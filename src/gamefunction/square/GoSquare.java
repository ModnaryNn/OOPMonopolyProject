package gamefunction.square;

import gamefunction.GameHandler;
import gamefunction.Square;
import gui.Position;

public class GoSquare extends Square {
    public GoSquare(int id, String name, Position position) {
        super(id, name, position);
    }

    @Override
    public void playAction(GameHandler gameHandler) {
        gameHandler.getCurrentPlayer().addMoney(200);
    }
}