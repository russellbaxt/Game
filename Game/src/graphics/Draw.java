package graphics;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import classes.Player;

public class Draw extends Canvas implements KeyListener
{
	Player player = new Player(24, 24, "res/p1.png");

	public void paint(Graphics g)
	{
		player.paint(g);
	}
	
	public void move()
	{
		player.move();
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		player.checkKeyPress(e);
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		player.checkKeyRelease(e);
	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}
}
