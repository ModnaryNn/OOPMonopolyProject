package main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class GamePanel extends JPanel {

	public static GamePanel gamePanel = null;
	public int currentState;
	public Scene currentScene;

	public GamePanel() {
		changeState(0);
	}

	public static GamePanel getGamePanel() {
		if (gamePanel == null)
		{
			gamePanel = new GamePanel();
		}
		return gamePanel;
	}

	public void changeState(int newState) {
		currentState = newState;
		switch (currentState){
			case 0:
				currentScene = new MenuScene();
				break;
			case 1:
				currentScene = new GameScene(this);
				break;
			default:
				System.out.println("Error: Invalid state");
				currentScene = null;
				break;
		}
	}

	public void update(double dt){
		currentScene.update(dt);
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		currentScene.draw(g);
}


}


