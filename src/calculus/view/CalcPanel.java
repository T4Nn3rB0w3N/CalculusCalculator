package calculus.view;

import javax.swing.*;
import calculus.controller.CalculusController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class CalcPanel extends JPanel
{
	
	private CalculusController theController;
	private SpringLayout theLayout;
	private JButton enterButton;
	private JButton clearButton;
	private JTextField inputField;
	private JTextField outputArea;
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
	private ArrayList<String> theNumbers;
	
	
	public CalcPanel(CalculusController theController)
	{
		super();
		this.theController = theController;
		this.theLayout = new SpringLayout();
		this.enterButton = new JButton("Enter");
		this.clearButton = new JButton("Clear");
		this.inputField = new JTextField("input here");
		
		this.outputArea = new JTextField("");
		
		
		this.multiplyButton = new JButton("*");
		this.addButton = new JButton("+");
		this.subtractButton = new JButton("-");
		this.divideButton = new JButton("/");
		
		this.logButton = new JButton("log");
		this.expButton = new JButton("^");
		this.lnButton = new JButton("ln");
		
		this.decimalPoint = new JButton(".");
		this.leftParenthesis = new JButton("(");
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
		
		this.theNumbers = new ArrayList<String>();
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public ArrayList<String> getTheNumberList()
	{
		return theNumbers;
	}
	
	public String getTheNumbers()
	{
		String numbers = "";
		for(String number : theNumbers)
		{
			numbers += number;
		}
		
		return numbers;
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
		theLayout.putConstraint(SpringLayout.WEST, inputField, 49, SpringLayout.WEST, this);
		theLayout.putConstraint(SpringLayout.NORTH, outputArea, 5, SpringLayout.NORTH, inputField);
		theLayout.putConstraint(SpringLayout.WEST, outputArea, 4, SpringLayout.EAST, inputField);
		theLayout.putConstraint(SpringLayout.EAST, outputArea, 225, SpringLayout.EAST, inputField);
		theLayout.putConstraint(SpringLayout.SOUTH, inputField, -40, SpringLayout.NORTH, leftParenthesis);
		
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
				outputArea.setText("");
				theNumbers.removeAll(theNumbers);
			}
		});
		
		//-------------OPERATION ActionListeners
		multiplyButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("*");
				outputArea.setText(getTheNumbers());
			}
		});
		
		addButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("+");
				outputArea.setText(getTheNumbers());
			}
		});
		
		subtractButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("-");
				outputArea.setText(getTheNumbers());
			}
		});
		
		divideButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("/");
				outputArea.setText(getTheNumbers());
			}
		});
		
		//------------EXPONENTIAL & LOGARITHM ActionListeners
		logButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("log(");
				outputArea.setText(getTheNumbers());
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
				theNumbers.add("ln(");
				outputArea.setText(getTheNumbers());
			}
		});
		
		//---------SYNTAX ActionListeners
		decimalPoint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add(".");
				outputArea.setText(getTheNumbers());
			}
		});
		
		leftParenthesis.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("(");
				outputArea.setText(getTheNumbers());
			}
		});
		
		rightParenthesis.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add(")");
				outputArea.setText(getTheNumbers());
			}
		});
		
		//------------NUMBER ActionListeners
		/*
		 * Need to find a way where when number buttons are pressed, 
		 * 		numbers show up in the outputArea
		 */
		zero.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("0");
				outputArea.setText(getTheNumbers());
			}
		});
		
		one.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("1");
				outputArea.setText(getTheNumbers());
			}
		});
		
		two.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("2");
				outputArea.setText(getTheNumbers());
				
			}
		});
		
		three.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("3");
				outputArea.setText(getTheNumbers());
			}
		});
		
		four.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("4");
				outputArea.setText(getTheNumbers());
			}
		});
		
		five.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("5");
				outputArea.setText(getTheNumbers());
			}
		});
		
		six.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("6");
				outputArea.setText(getTheNumbers());
			}
		});
		
		seven.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("7");
				outputArea.setText(getTheNumbers());
			}
		});
		
		eight.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("8");
				outputArea.setText(getTheNumbers());
			}
		});
		
		nine.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				theNumbers.add("9");
				outputArea.setText(getTheNumbers());
			}
		});
	}

}
