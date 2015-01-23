package gui;
import javax.swing.JFrame;

public class SlidePuzzle {

	public static void main(String[] args) 
	{
		//Create the Puzzle-Frame with one Panel where we place our Picture-Parts
		//in 16 buttons
		SlidePuzzleFrame frame = new SlidePuzzleFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		
		//Check all Parts on the right Place
		while(!frame.panel.isRight())
			;
		
		//WIN
	}
}
