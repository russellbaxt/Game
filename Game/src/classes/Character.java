package classes;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Character
{
	private int x = 0;
	private int y = 0;
	private String path;
	private Image image;
	private int speed;
	private int angle = 0;

	public Character(int x, int y, String path)
	{
		this.x = x;
		this.y = y;
		this.path = path;
		try
		{
			image = ImageIO.read(new File(path));
		} catch (IOException e)
		{
			System.out.println("Error loading image " + path);
		}
	}

	public void paint(Graphics g)
	{
		g.drawImage(image, x, y, null);
	}

	public void move()
	{
		x += speed * Math.cos(Math.toRadians(angle));
		y += speed * Math.sin(Math.toRadians(angle));
		
		if (y < 0)
		{
			y = 0;
		}
		
		if (y > 768 - 24)
		{
			y = 768 - 24;
		}
		
		if (x < 0)
		{
			x = 0;
		}
		
		if (x > 1008 - 24)
		{
			x = 1008 - 24;
		}
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

	public String getPath()
	{
		return path;
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}

	public int getSpeed()
	{
		return speed;
	}

	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public int getAngle()
	{
		return angle;
	}
	
	public void setAngle(int value)
	{
		angle = value;
	}
}
