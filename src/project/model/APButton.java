package project.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class APButton extends JButton
{
	int pos, num;
	
	public APButton(String name, int num, int pos, Boolean enabled)
	{
		this.setText(name);
		this.pos = pos;
		this.num = num;
		setupButton(this);
	}
	
	public void setupButton(APButton button)
	{
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				int mover = button.getButtonPosition();
				
				if(mover <= 3)
				{
					
				}
				
			}
		});
	}
	
	public int getNorthButton(APButton button)
	{
		int res = 0;
		if(button.getButtonNumber() <= 4)
			res = 0;
		else
			res = button.getButtonNumber() - 4;
		
		//System.out.println("North: " + res);
			
		return(res);
	}
	public int getSouthButton(APButton button)
	{
		int res = 0;
		if(button.getButtonNumber() >= 13 && button.getButtonNumber() <= 16)
			res = 0;
		else
			res = button.getButtonNumber() + 4;
			
		//System.out.println("South: " + res);
		
		return(res);
	}
	public int getEastButton(APButton button)
	{
		int res = 0;
		if(button.getButtonNumber() == 4 || button.getButtonNumber() == 8 || button.getButtonNumber() == 12 || button.getButtonNumber() == 16)
			res = 0;
		else
			res = button.getButtonNumber() + 1;
		
		//System.out.println("East: " + res);
		
		return(res);
	}
	public int getWestButton(APButton button)
	{
		int res = 0;
		if(button.getButtonNumber() == 1 || button.getButtonNumber() == 5 || button.getButtonNumber() == 9 || button.getButtonNumber() == 13)
			res = 0;
		else
			res = button.getButtonNumber() - 1;
		
		//System.out.println("West: " + res);
			
		return(res);
	}
	
	
	public int[] getSurroundingButtons(APButton button)
	{
		int[] res = {0,0,0,0};
		
		res[0] = button.getNorthButton(button);
		res[1] = button.getSouthButton(button);
		res[2] = button.getEastButton(button);
		res[3] = button.getWestButton(button);
		
		return(res);
	}
	
	public Boolean[] getEnabledButtons(APButton button)
	{
		Boolean[] enabled = {true, true, true, true};
		
		enabled[0] = button.isEnabled();
		enabled[1] = button.isEnabled();
		enabled[2] = button.isEnabled();
		enabled[3] = button.isEnabled();
		
		
		return(enabled);
	}
	
	public boolean getDisabled(APButton button)
	{
		return true;
	}
	
	public String getButtonName(APButton button)
	{
		return button.getText();
	}
	
	public int getButtonPosition()
	{
		return pos;
	}
	
	public int getButtonNumber()
	{
		return num;
	}
	
	public Boolean isButtonEnabled(APButton button)
	{
		return button.isEnabled();
	}
	
	
	
}
