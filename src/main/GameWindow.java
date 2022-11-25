package main;

import javax.swing.*;

public class GameWindow {
	private JFrame jframe;
	public static GameWindow gameWindow = null;

	public GameWindow() {

		jframe = new JFrame();
		jframe.setTitle(Constant.SCREEN_TITLE);
		jframe.setSize(Constant.SCREEN_WIDTH, Constant.SCREEN_HEIGHT);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(GamePanel.getGamePanel());
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);

	}

	public static GameWindow getGameWindow() {
		if (GameWindow.gameWindow == null) {
			GameWindow.gameWindow = new GameWindow();
		}
		return GameWindow.gameWindow;
	}

	public void addPanel(JPanel panel) {
		jframe.add(panel);
	}

}
