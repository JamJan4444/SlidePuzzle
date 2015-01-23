package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class SlidePuzzlePanel extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private ImageIcon[] parts = new ImageIcon[16];
	private JButton[] btn = new JButton[16];
	
	private int emptyField = 15;
	
	public SlidePuzzlePanel() 
	{	
		//Loading the Parts of the Picture
		loadIcons();
		
		//Create the Buttons with their pics
		addButtons();
	}
	
	private void loadIcons()
	{	
		parts[0] = new ImageIcon(getClass().getResource("/scream0.png"));
		parts[1] = new ImageIcon(getClass().getResource("/scream1.png"));
		parts[2] = new ImageIcon(getClass().getResource("/scream2.png"));
		parts[3] = new ImageIcon(getClass().getResource("/scream3.png"));
		parts[4] = new ImageIcon(getClass().getResource("/scream4.png"));
		parts[5] = new ImageIcon(getClass().getResource("/scream5.png"));
		parts[6] = new ImageIcon(getClass().getResource("/scream6.png"));
		parts[7] = new ImageIcon(getClass().getResource("/scream7.png"));
		parts[8] = new ImageIcon(getClass().getResource("/scream8.png"));
		parts[9] = new ImageIcon(getClass().getResource("/scream9.png"));
		parts[10] = new ImageIcon(getClass().getResource("/scream10.png"));
		parts[11] = new ImageIcon(getClass().getResource("/scream11.png"));
		parts[12] = new ImageIcon(getClass().getResource("/scream12.png"));
		parts[13] = new ImageIcon(getClass().getResource("/scream13.png"));
		parts[14] = new ImageIcon(getClass().getResource("/scream14.png"));
		
		shuffle(parts);
		
		parts[15] = new ImageIcon(getClass().getResource("/scream15.png"));
	}
				
	private void addButtons()
	{
		add(getBtn0());
		add(getBtn1());
		add(getBtn2());
		add(getBtn3());
		
		add(getBtn4());
		add(getBtn5());
		add(getBtn6());
		add(getBtn7());
		
		add(getBtn8());
		add(getBtn9());
		add(getBtn10());
		add(getBtn11());
		
		add(getBtn12());
		add(getBtn13());
		add(getBtn14());
		add(getBtn15());
		
	}
	
	private JButton getBtn0()
	{
		if(btn[0] == null)
		{
			btn[0] = new JButton(parts[0]);
			btn[0].setBounds(0, 0, 125, 125);
			
			btn[0].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(0);
				}
			});
		}
		return btn[0];
	}
	
	private JButton getBtn1()
	{
		if(btn[1] == null)
		{
			btn[1] = new JButton(parts[1]);
			btn[1].setBounds(125, 0, 125, 125);
			
			btn[1].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(1);
				}
			});
		}
			return btn[1];
	}
	
	private JButton getBtn2()
	{
		if(btn[2] == null)
		{
			btn[2] = new JButton(parts[2]);
			btn[2].setBounds(250, 0, 125, 125);
			
			btn[2].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(2);
				}
			});
		}
			return btn[2];
	}
	
	private JButton getBtn3()
	{
		if(btn[3] == null)
		{
			btn[3] = new JButton(parts[3]);
			btn[3].setBounds(375, 0, 125, 125);
			
			btn[3].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(3);
				}
			});
		}
			return btn[3];
	}
	
	private JButton getBtn4()
	{
		if(btn[4] == null)
		{
			btn[4] = new JButton(parts[4]);
			btn[4].setBounds(0, 125, 125, 125);
			
			btn[4].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(4);
				}
			});
		}
		return btn[4];
	}
	
	private JButton getBtn5()
	{
		if(btn[5] == null)
		{
			btn[5] = new JButton(parts[5]);
			btn[5].setBounds(125, 125, 125, 125);
			
			btn[5].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(5);
				}
			});
		}
			return btn[5];
	}
	
	private JButton getBtn6()
	{
		if(btn[6] == null)
		{
			btn[6] = new JButton(parts[6]);
			btn[6].setBounds(250, 125, 125, 125);
			
			btn[6].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(6);
				}
			});
		}
			return btn[6];
	}
	
	private JButton getBtn7()
	{
		if(btn[7] == null)
		{
			btn[7] = new JButton(parts[7]);
			btn[7].setBounds(375, 125, 125, 125);
			
			btn[7].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(7);
				}
			});
		}
			return btn[7];
	}
	
	private JButton getBtn8()
	{
		if(btn[8] == null)
		{
			btn[8] = new JButton(parts[8]);
			btn[8].setBounds(0, 250, 125, 125);
			
			btn[8].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(8);
				}
			});
		}
		return btn[8];
	}
	
	private JButton getBtn9()
	{
		if(btn[9] == null)
		{
			btn[9] = new JButton(parts[9]);
			btn[9].setBounds(125, 250, 125, 125);
			
			btn[9].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(9);
				}
			});
		}
			return btn[9];
	}
	
	private JButton getBtn10()
	{
		if(btn[10] == null)
		{
			btn[10] = new JButton(parts[10]);
			btn[10].setBounds(250, 250, 125, 125);
			
			btn[10].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(10);
				}
			});
		}
			return btn[10];
	}
	
	private JButton getBtn11()
	{
		if(btn[11] == null)
		{
			btn[11] = new JButton(parts[11]);
			btn[11].setBounds(375, 250, 125, 125);
			
			btn[11].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(11);
				}
			});
		}
			return btn[11];
	}
	
	private JButton getBtn12()
	{
		if(btn[12] == null)
		{
			btn[12] = new JButton(parts[12]);
			btn[12].setBounds(0, 375, 125, 125);
			
			btn[12].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(12);
				}
			});
		}
			return btn[12];
	}
	
	private JButton getBtn13()
	{
		if(btn[13] == null)
		{
			btn[13] = new JButton(parts[13]);
			btn[13].setBounds(125, 375, 125, 125);
			
			btn[13].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(13);
				}
			});
		}
			return btn[13];
	}
	
	private JButton getBtn14()
	{
		if(btn[14] == null)
		{
			btn[14] = new JButton(parts[14]);
			btn[14].setBounds(250, 375, 125, 125);
			
			btn[14].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(14);
				}
			});
		}
			return btn[14];
	}
	
	private JButton getBtn15()
	{
		if(btn[15] == null)
		{
			btn[15] = new JButton(parts[15]);
			btn[15].setBounds(375, 375, 125, 125);
			
			btn[15].addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent evt) 
				{
					movePart(15);
				}
			});
		}
			return btn[15];
	}
	
	public void movePart(int index)
	{		
		if(((index==4)||(index==8)||(index==12))&&((emptyField==3)||(emptyField==7)||(emptyField==11)))
			return;
		
		if(((index==3)||(index==7)||(index==11))&&((emptyField==4)||(emptyField==8)||(emptyField==12)))
			return;
		
		if((index == emptyField + 1)||(index == emptyField - 1)||(index == emptyField + 4)||(index == emptyField - 4))
		{		
			Icon tmp;
			tmp = btn[index].getIcon();
			btn[index].setIcon(btn[emptyField].getIcon());
			btn[emptyField].setIcon(tmp);
			emptyField = index;
		}
		
	}
	
	public boolean isRight()
	{
		return false;
	}
	
    private ImageIcon[] shuffle(ImageIcon[] p) 
    { 
        ImageIcon tmp; 
        int rand; 
        Random r = new Random();
        
        for (int i = 1; i < p.length-1; i++) 
        { 
            rand = r.nextInt(p.length-1); 
            tmp = p[i]; 
            p[i] = p[rand]; 
            p[rand] = tmp; 
        } 
        return p; 
    } 
	
}


