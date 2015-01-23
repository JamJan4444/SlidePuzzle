package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class SlidePuzzleFrame extends JFrame
{
		private static final long serialVersionUID = 1L;
		
		public static final int DEFAULT_WIDTH = 516;
		public static final int DEFAULT_HEIGHT = 539;
		
		public SlidePuzzlePanel panel;
		
		public SlidePuzzleFrame() 
		{
			setTitle("Slide Puzzle");
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			
			panel = new SlidePuzzlePanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			add(panel);
		}
	}