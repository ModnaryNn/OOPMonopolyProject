package main;


import java.awt.*;

public class GameScene extends Scene{

    public GamePanel gamePanel;
    public GameScene(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }


    @Override
    public void update(double dt) {

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,100,100);
    }
}
