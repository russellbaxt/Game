package setup;

import graphics.Draw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Main implements ActionListener, KeyListener
{
	Draw draw;
	JFrame frame;
	Timer timer;

	public static void main(String[] args)
	{
		new Main().setup();
	}

	public void setup()
	{
		frame = new JFrame();
		frame.setSize(1008, 790);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		draw = new Draw();
		frame.add(draw);
		frame.addKeyListener(draw);

		timer = new Timer(16, this);

		timer.start();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(timer))
		{
			draw.repaint();
			draw.move();
		}
	}

	@Override
	public void keyPressed(KeyEvent e)
	{

	}

	@Override
	public void keyReleased(KeyEvent e)
	{

	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

}
