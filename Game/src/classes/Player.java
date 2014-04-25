package classes;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Player extends Character
{
	private boolean keyUp = false;
	private boolean keyDown = false;
	private boolean keyLeft = false;
	private boolean keyRight = false;

	public Player(int x, int y, String path)
	{
		super(x, y, path);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
	}

	public void checkKeyPress(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			setSpeed(4);
			keyUp = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			setSpeed(4);
			keyDown = true;
		}
		
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			setSpeed(4);
			keyLeft = true;
		}


		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			setSpeed(4);
			keyRight = true;
		}
	}

	public void checkKeyRelease(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			keyUp = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			keyDown = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			keyLeft = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			keyRight = false;
		}

		if (keyUp == false && keyRight == false && keyDown == false
				&& keyLeft == false)
		{
			setSpeed(0);
		}
	}

	public void move()
	{
		if (keyUp)
		{
			setAngle(270);
		}

		if (keyDown)
		{
			setAngle(90);
		}
		
		if (keyLeft)
		{
			setAngle(180);
		}
		
		if (keyRight)
		{
			setAngle(0);
		}

		if (keyRight && keyUp)
		{
			setAngle(315);
		}

		if (keyRight && keyDown)
		{
			setAngle(40);
		}

		if (keyDown && keyLeft)
		{
			setAngle(130);
		}

		if (keyLeft && keyUp)
		{
			setAngle(220);
		}
		
		super.move();
	}

	public boolean isKeyUp()
	{
		return keyUp;
	}

	public void setKeyUp(boolean keyUp)
	{
		this.keyUp = keyUp;
	}

	public boolean isKeyLeft()
	{
		return keyLeft;
	}

	public void setKeyLeft(boolean keyLeft)
	{
		this.keyLeft = keyLeft;
	}

	public boolean isKeyDown()
	{
		return keyDown;
	}

	public void setKeyDown(boolean keyDown)
	{
		this.keyDown = keyDown;
	}

	public boolean isKeyRight()
	{
		return keyRight;
	}

	public void setKeyRight(boolean keyRight)
	{
		this.keyRight = keyRight;
	}
}
