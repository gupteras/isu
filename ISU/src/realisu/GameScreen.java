package realisu;

import javax.swing.JFrame;
import java.awt.*;
public class GameScreen{
	private JFrame gamescreen;
	public GameScreen() {
		JFrame gamescreen = new JFrame("Snake");
		gamescreen.setContentPane(new GamePanel());
		gamescreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gamescreen.setResizable(false);
		gamescreen.pack();
		
		gamescreen.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
		gamescreen.setLocationRelativeTo(null);
		gamescreen.setVisible(true);
	}
}


