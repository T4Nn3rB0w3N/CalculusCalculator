package calculus.view;

import javax.swing.*;
import calculus.controller.CalculusController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcPanel extends JPanel
{
	
	private CalculusController theController;
	private SpringLayout theLayout;
	private JButton enterButton;
	private JButton clearButton;
	private JTextField inputField;
	private JTextArea outputArea;
	//////////FOUR BASIC OPERATIONS/////////
	private JButton multiplyButton;
	private JButton addButton;
	private JButton subtractButton;
	private JButton divideButton;
	///////EXPONENTIALS/////////////
	private JButton logButton; //This is supposed to be for ordinary logarithm operations
	private JButton expButton; //This is supposed to be for exponentials
	private JButton lnButton; //This is for the natural logarithm button
	
	private JButton decimalPoint; //This allows the user to use decimal numbers
	private JButton leftParenthesis; //This is a left paren
	private JButton rightParenthesis; //This is a right paren
	///////NUMBER BUTTONS///////
	private JButton zero;
	private JButton one;
	private JButton two;
	private JButton three;
	private JButton four;
	private JButton five;
	private JButton six;
	private JButton seven;
	private JButton eight;
	private JButton nine;
	
	
	
	
	public CalcPanel(CalculusController theController)
	{
		super();
		this.theController = theController;
		this.theLayout = new SpringLayout();
		this.enterButton = new JButton("Enter");
		this.clearButton = new JButton("Clear");
		this.inputField = new JTextField("input here");
		theLayout.putConstraint(SpringLayout.WEST, inputField, 49, SpringLayout.WEST, this);
		this.outputArea = new JTextArea("");
		
		this.multiplyButton = new JButton("*");
		this.addButton = new JButton("+");
		this.subtractButton = new JButton("-");
		this.divideButton = new JButton("/");
		
		this.logButton = new JButton("log");
		this.expButton = new JButton("^");
		this.lnButton = new JButton("ln");
		
		this.decimalPoint = new JButton(".");
		this.leftParenthesis = new JButton("(");
		theLayout.putConstraint(SpringLayout.SOUTH, inputField, -40, SpringLayout.NORTH, leftParenthesis);
		this.rightParenthesis = new JButton(")");
		
		this.zero = new JButton("0");
		this.one = new JButton("1");
		this.two = new JButton("2");
		this.three = new JButton("3");
		this.four = new JButton("4");
		this.five = new JButton("5");
		this.six = new JButton("6");
		this.seven = new JButton("7");
		this.eight = new JButton("8");
		this.nine = new JButton("9");
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(theLayout);
		this.add(enterButton);
		this.add(clearButton);
		this.add(inputField);
		this.add(outputArea);
		
		this.add(multiplyButton);
		this.add(addButton);
		this.add(subtractButton);
		this.add(divideButton);
		
		this.add(logButton);
		this.add(expButton);
		this.add(lnButton);
		
		this.add(decimalPoint);
		this.add(leftParenthesis);
		this.add(rightParenthesis);
		
		this.add(zero);
		this.add(one);
		this.add(two);
		this.add(three);
		this.add(four);
		this.add(five);
		this.add(six);
		this.add(seven);
		this.add(eight);
		this.add(nine);
	}
	
	private void setupLayout()
	{
		theLayout.putConstraint(SpringLayout.WEST, clearButton, 0, SpringLayout.WEST, enterButton);
		theLayout.putConstraint(SpringLayout.SOUTH, clearButton, -6, SpringLayout.NORTH, multiplyButton);
		theLayout.putConstraint(SpringLayout.WEST, multiplyButton, 0, SpringLayout.WEST, enterButton);
		theLayout.putConstraint(SpringLayout.WEST, addButton, 0, SpringLayout.WEST, enterButton);
		theLayout.putConstraint(SpringLayout.SOUTH, addButton, -6, SpringLayout.NORTH, subtractButton);
		theLayout.putConstraint(SpringLayout.WEST, subtractButton, 0, SpringLayout.WEST, enterButton);
		theLayout.putConstraint(SpringLayout.SOUTH, multiplyButton, -6, SpringLayout.NORTH, divideButton);
		theLayout.putConstraint(SpringLayout.WEST, divideButton, 0, SpringLayout.WEST, enterButton);
		theLayout.putConstraint(SpringLayout.NORTH, divideButton, 0, SpringLayout.NORTH, logButton);
		theLayout.putConstraint(SpringLayout.WEST, logButton, 0, SpringLayout.WEST, this);
		theLayout.putConstraint(SpringLayout.NORTH, expButton, 6, SpringLayout.SOUTH, logButton);
		theLayout.putConstraint(SpringLayout.EAST, expButton, 0, SpringLayout.EAST, logButton);
		theLayout.putConstraint(SpringLayout.NORTH, lnButton, 6, SpringLayout.SOUTH, expButton);
		theLayout.putConstraint(SpringLayout.NORTH, subtractButton, 0, SpringLayout.NORTH, lnButton);
		theLayout.putConstraint(SpringLayout.EAST, lnButton, 0, SpringLayout.EAST, logButton);
		theLayout.putConstraint(SpringLayout.NORTH, enterButton, 0, SpringLayout.NORTH, decimalPoint);
		theLayout.putConstraint(SpringLayout.NORTH, leftParenthesis, 116, SpringLayout.NORTH, this);
		theLayout.putConstraint(SpringLayout.NORTH, logButton, 0, SpringLayout.SOUTH, leftParenthesis);
		theLayout.putConstraint(SpringLayout.EAST, leftParenthesis, 0, SpringLayout.EAST, logButton);
		theLayout.putConstraint(SpringLayout.NORTH, rightParenthesis, 116, SpringLayout.NORTH, this);
		theLayout.putConstraint(SpringLayout.WEST, rightParenthesis, 8, SpringLayout.EAST, leftParenthesis);
		theLayout.putConstraint(SpringLayout.WEST, enterButton, 87, SpringLayout.EAST, zero);
		theLayout.putConstraint(SpringLayout.WEST, zero, 230, SpringLayout.WEST, this);
		theLayout.putConstraint(SpringLayout.EAST, decimalPoint, -6, SpringLayout.WEST, zero);
		theLayout.putConstraint(SpringLayout.NORTH, decimalPoint, 6, SpringLayout.SOUTH, one);
		theLayout.putConstraint(SpringLayout.EAST, one, 0, SpringLayout.EAST, decimalPoint);
		theLayout.putConstraint(SpringLayout.NORTH, zero, 6, SpringLayout.SOUTH, two);
		theLayout.putConstraint(SpringLayout.WEST, two, 0, SpringLayout.WEST, zero);
		theLayout.putConstraint(SpringLayout.WEST, three, 6, SpringLayout.EAST, two);
		theLayout.putConstraint(SpringLayout.NORTH, one, 6, SpringLayout.SOUTH, four);
		theLayout.putConstraint(SpringLayout.WEST, four, 0, SpringLayout.WEST, decimalPoint);
		theLayout.putConstraint(SpringLayout.NORTH, two, 6, SpringLayout.SOUTH, five);
		theLayout.putConstraint(SpringLayout.WEST, five, 0, SpringLayout.WEST, zero);
		theLayout.putConstraint(SpringLayout.NORTH, three, 6, SpringLayout.SOUTH, six);
		theLayout.putConstraint(SpringLayout.EAST, six, 0, SpringLayout.EAST, three);
		theLayout.putConstraint(SpringLayout.NORTH, seven, 0, SpringLayout.SOUTH, rightParenthesis);
		theLayout.putConstraint(SpringLayout.NORTH, four, 6, SpringLayout.SOUTH, seven);
		theLayout.putConstraint(SpringLayout.EAST, seven, 0, SpringLayout.EAST, decimalPoint);
		theLayout.putConstraint(SpringLayout.NORTH, eight, 145, SpringLayout.NORTH, this);
		theLayout.putConstraint(SpringLayout.NORTH, five, 6, SpringLayout.SOUTH, eight);
		theLayout.putConstraint(SpringLayout.EAST, eight, 0, SpringLayout.EAST, zero);
		theLayout.putConstraint(SpringLayout.NORTH, nine, 145, SpringLayout.NORTH, this);
		theLayout.putConstraint(SpringLayout.NORTH, six, 6, SpringLayout.SOUTH, nine);
		theLayout.putConstraint(SpringLayout.EAST, nine, 0, SpringLayout.EAST, three);
	}
	
	private void setupListeners()
	{
		enterButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		clearButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		//-------------OPERATION ActionListeners
		multiplyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		addButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		subtractButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		divideButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		//------------EXPONENTIAL & LOGARITHM ActionListeners
		logButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		expButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		lnButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		//---------SYNTAX ActionListeners
		decimalPoint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		leftParenthesis.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		rightParenthesis.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		//------------NUMBER ActionListeners
		/*
		 * Need to find a way where when number buttons are pressed, 
		 * 		numbers show up in the input field
		 */
		zero.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		one.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		two.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		three.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		four.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		five.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		six.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		seven.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		eight.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
		
		nine.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				
			}
		});
	}

}
