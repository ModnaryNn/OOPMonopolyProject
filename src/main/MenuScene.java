package main;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class MenuScene extends Scene{

    int i = 0;


    public BufferedImage title, play, playPressed, exit, exitPressed;
    public BufferedImage playCurrentImage, exitCurrentImage;

    public MenuScene() {

    }

    @Override
    public void update(double dt) {
        if (i<100){
            i++;
        }
        else {
            GamePanel.getGamePanel().changeState(1);
        }
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 100, 100);
    }
}
