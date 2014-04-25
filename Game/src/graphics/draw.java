package graphics;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import classes.b1;
import classes.p1;

public class draw extends Canvas implements KeyListener, MouseListener
{
	p1 p = new p1(24, 24, "res/p1.png");
	b1 b = new b1(72, 72, "res/b1.png", 0);

	public draw()
	{
		this.addKeyListener(this);
		this.addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		p.paint(g);
		b.paint(g);
	}
	
	public void move()
	{
		p.move();
		b.move();
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		p.checkKeyPress(e);
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		p.checkKeyRelease(e);
	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		p.shoot(e);
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		
	}
}
