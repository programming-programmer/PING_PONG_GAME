import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GamePanel panel;
	
	GameFrame() {
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("THE Ping Pong Game");
		this.setResizable(false);
		this.setBackground(Color.BLACK);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack(); // allows window to fit optimal size for the machine used
		this.setVisible(true);
		// this.setLocationRelativeTo(null);
		
	}
}
