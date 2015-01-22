package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;


public class ButtonFrame extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static final int DEFAULT_WIDTH = 600;
	public static final int DEFAULT_HEIGHT = 200;
	
	public ButtonFrame() 
	{
		setTitle("Font-Magic");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		
		ButtonPanel panel = new ButtonPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		add(panel);
	}
}
