package main;


import gamefunction.Board;

import java.awt.*;

public class GameScene extends Scene{

    public Board board = new Board();
    public GameScene( ){

    }


    @Override
    public void update(double dt) {

    }

    @Override
    public void draw(Graphics g) {
        board.draw(g);

        //player.draw(g);
    }
}
