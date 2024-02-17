package miniZelda_package;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable{

	public static int WIDTH = 1024, HEIGHT = 768;

	public Game() {
		this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
	
	public static void main(String[] args) {
		Game game = new Game();
		JFrame frame = new JFrame();
		
		frame.add(game);
		frame.setTitle("Mini Zelda");
		frame.setLocationRelativeTo(null);
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
	}
	
	@Override
	public void run() {
		
	}

}
