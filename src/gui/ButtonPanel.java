package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class ButtonPanel extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ButtonGroup bg;
	
	private JRadioButton middleButton;
	private JRadioButton smallButton;
	private JRadioButton bigButton;
	private JLabel lbl;
	
	/**
	 * Konstruktor
	 */
		public ButtonPanel() 
		{	
			bg = new ButtonGroup();
			
			add(getMiddleButton());
			add(getSmallButton());
			add(getBigButton());
			add(getJLabel());
			
			bg.add(smallButton);
			bg.add(bigButton);
			bg.add(middleButton);
		}

//		@Override
//		public void actionPerformed(ActionEvent evt) 
//		{	
//			Object source = evt.getSource();
//			if(source == yellowButton)
//				setBackground(Color.YELLOW);
//			else if(source == blueButton)
//				setBackground(Color.BLUE);
//			else if(source == redButton)
//				setBackground(Color.RED);
//			
//		}
		
		private JRadioButton getSmallButton()
		{
			if(smallButton == null)
			{
				smallButton = new JRadioButton("Small");
				smallButton.setBounds(40, 35, 80, 25);
			
				/**
				 * Event for Button Blue
				 */
				smallButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						ButtonModel bm = bg.getSelection();
						bg.clearSelection();
						bg.setSelected(bm, true);
						lbl.setFont(lbl.getFont().deriveFont(10f));
					}
				});
			}
			return smallButton;
		}
		
		private JRadioButton getMiddleButton()
		{
			if(middleButton == null)
			{
				middleButton = new JRadioButton("Middle");
				middleButton.setBounds(40, 60, 80, 25);
			
				/**
				 * Event for Button Blue
				 */
				middleButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						ButtonModel bm = bg.getSelection();
						bg.clearSelection();
						bg.setSelected(bm, true);
						lbl.setFont(lbl.getFont().deriveFont(20f));
					}
				});
			}
			return middleButton;
		}
		
		private JRadioButton getBigButton()
		{
			if(bigButton == null)
			{
				bigButton = new JRadioButton("Big");
				bigButton.setBounds(40, 85, 80, 25);
			
				/**
				 * Event for Button Blue
				 */
				bigButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent evt) 
					{
						ButtonModel bm = bg.getSelection();
						bg.clearSelection();
						bg.setSelected(bm, true);
						lbl.setFont(lbl.getFont().deriveFont(30f));
					}
				});
			}
			return bigButton;
		}
		
		private JLabel getJLabel()
		{
			if(lbl == null)
			{
				lbl = new JLabel("HeyHo this is my Test Text!");
				lbl.setBounds(125, 50, 400, 45);
			}
			
			return lbl;
		}
}


