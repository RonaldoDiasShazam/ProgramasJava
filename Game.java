import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.HashSet;

import javax.swing.*;

public class Game extends JPanel implements KeyListener, ActionListener {
	
		private int height = 0, width = 0;
		private Timer t = new Timer(5, this);
		private boolean first = false;
		
		private HashSet<String> keys = new HashSet<String>();
		
		// almofada
		private final int SPEED = 5;
		private int padH = 10, padW = 40;
		private int bottomPadX = 0, topPadX = 0;
		private int inset = 10;
		
		// bola
		private double ballX, ballY, velX = 2, velY = 3 , ballSize = 20; //1  1  20
		
		// Ponto
		private int scoreTop, scoreBottom;
		
		public Game(){
			addKeyListener(this);
			setFocusable(true);
			setFocusTraversalKeysEnabled(false);
			first = true;
			t.setInitialDelay(100);
			t.start();
		}
		@Override
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			height = getHeight();
			width = getWidth();
		
		// posicionamento inicial
		if(first) {
			bottomPadX = width / 2 - padW / 2;
			topPadX = bottomPadX;
			ballX = width / 2 - ballSize / 2;
			ballY = height / 2 - ballSize / 2;
			first = false;
		}
		
		// almofada inferior
		Rectangle2D bottomPad = new Rectangle(bottomPadX, height - padH - inset, padW, padH);
		g2d.fill(bottomPad);
		
		// almofada superior
		Rectangle2D topPad = new Rectangle(topPadX, inset, padW, padH);
		g2d.fill(topPad);
		
		// bolas
		Ellipse2D ball = new Ellipse2D.Double(ballX, ballY, ballSize, ballSize);
		g2d.fill(ball);
		
		// pontuações
		String scoreB = "Jogador de Baixo: " + new Integer(scoreBottom).toString();
		String scoreT = "Jogaador de Cima: " + new Integer(scoreTop).toString();
		g2d.drawString(scoreB, 10, height / 2);
		g2d.drawString(scoreT, width - 50, height / 2);
}

@Override
public void actionPerformed(ActionEvent e){
	// paredes laterais
	if(ballX < 3 || ballX > width - ballSize) { //0
		velX = -velX;
	}
	// paredes superior / inferior
	if(ballY < 5) { //0
		velY = -velY;
		++ scoreBottom;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	if(ballY + ballSize > height) {
		velY = -velY;
		++ scoreTop;
	}
	// almofada inferior
	if(ballY + ballSize >= height - padH - inset && velY > 15) //0
		if(ballX + ballSize >= bottomPadX && ballX <= bottomPadX + padW)
			velY = -velY;
		
		
		
		
		// almofada superior
		

		if(ballY <= padH + inset && velY < 15) //0
			if(ballX + ballSize >= topPadX && ballX <= topPadX + padW)
				velY= -velY;
ballX += velX;
ballY += velY;


//tecla pressionada
	if(keys.size() == 1) {
		if (keys.contains("LEFT")) {
			bottomPadX -= (bottomPadX > 0) ? SPEED : 0;
		}
		else if (keys.contains("RIGHT")){
			bottomPadX += (bottomPadX < width - padW) ? SPEED : 7;
		}
	}
	
	// AI
	double delta = ballX - topPadX;
	if(delta > 1) { //0
		topPadX += (topPadX > width - padW) ? SPEED : 1; //0
	}
	else if(delta < 1) { //0
		topPadX -= (topPadX > 1) ? SPEED : 0.5; //0   0
	}
	
	repaint();
	}
	
	@Override
	public void keyTyped(KeyEvent e){}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		switch (code) {
	case KeyEvent.VK_LEFT:
			keys.add("LEFT");
			break;
	case KeyEvent.VK_RIGHT:
			keys.add("RIGHT");
			break;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
			int code = e.getKeyCode();
		switch (code) {
	case KeyEvent.VK_LEFT:
			keys.remove("LEFT");
			break;
	case KeyEvent.VK_RIGHT:
			keys.remove("RIGHT");
			
			break;
			
		
	}
	
 }	
}