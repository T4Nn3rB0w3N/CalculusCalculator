package calculus.controller;

import calculus.view.*;

public class CalculusController
{
	private String operation;
	private CalcFrame theFrame;
	private CalcPanel thePanel;
	
	public CalculusController()
	{
		theFrame = new CalcFrame(this);
		thePanel = new CalcPanel(this);
	}
	
	public CalculusController(String operation)
	{
		this.operation = operation;
	}
	
	public void start()
	{
		
	}
	
	public CalcFrame getTheFrame()
	{
		return theFrame;
	}
	
	public CalcPanel getThePanel()
	{
		return thePanel;
	}
	
	private String processInput(String input)
	{
		return "";
	}
	
	private void syntax()
	{
		/*
		 * Need program to recognize that a is the first number, b is the second number, and c is the third number
		 * 		and that b and/or c don't have to be used.
		 * x is a variable that counts as part of a number. 
		 */
	}
	
	public void recognizeOperations()
	{
		if (operation == "+")
		{
			
		}
		
		if (operation == "-")
		{
			
		}
		
		if (operation == "/")
		{
			
		}
		
		if (operation == "*")
		{
			
		}
		
	}
}