package calculus.model;

import calculus.view.CalcPanel;
import java.util.ArrayList;

public class CalcModel
{
	private String operation;
	private CalcPanel thePanel;
	
	public CalcModel(String operation)
	{
		this.operation = operation;
	}
	
	public int processInput()
	{
		String numbers = "";
		for (String operation : thePanel.getTheNumberList())
		{
			while(operation != "+")
			{
				while(operation != "-")
				{
					while(operation != "*")
					{
						while(operation != "/")
						{
							numbers += operation;
						}
					}
				}
			}
			
			if (operation == "+")
			{	int firstOccurence = thePanel.getTheNumberList().indexOf("+");
				int number = Integer.parseInt(numbers);
				int otherNumber = Integer.parseInt(numbers);
				
			}
			
		}
	}
}
