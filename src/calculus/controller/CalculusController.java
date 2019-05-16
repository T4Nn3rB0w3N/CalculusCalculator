package calculus.controller;

import calculus.view.*;

public class CalculusController
{
	private int a;
	private int b;
	private int c;
	private String operation;
	private CalcFrame theFrame;
	private CalcPanel thePanel;
	
	public CalculusController()
	{
		theFrame = new CalcFrame(this);
	}
	
	public CalculusController(int a, int b, int c, String operation)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.operation = operation;
	}
	
	public void start()
	{
		
	}
	
	public CalcFrame getTheFrame()
	{
		return theFrame;
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
	
	private void recognizeOperations()
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