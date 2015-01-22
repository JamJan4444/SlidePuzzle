package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class SlidePuzzleFrame extends JFrame
{
		private static final long serialVersionUID = 1L;
		
		public static final int DEFAULT_WIDTH = 500;
		public static final int DEFAULT_HEIGHT = 500;
		
		public SlidePuzzleFrame() 
		{
			setTitle("Slide Puzzle");
			setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
			
			SlidePuzzlePanel panel = new SlidePuzzlePanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			add(panel);
		}
	}