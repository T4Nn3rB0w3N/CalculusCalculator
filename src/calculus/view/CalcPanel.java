package calculus.view;

import javax.swing.*;
import calculus.controller.CalculusController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcPanel extends JPanel
{
	
	private CalculusController theController;
	private SpringLayout theLayout;
	//////////FOUR BASIC OPERATIONS/////////
	private JButton multiplyButton;
	private JButton addButton;
	private JButton subtractButton;
	private JButton divideButton;
	///////EXPONENTIALS/////////////
	private JButton logButton; //This is supposed to be for ordinary logarithm operations
	private JButton raiseByPower; //This is supposed to be for exponentials - GET A BETTER NAME FOR THE VARIABLE-
	private JButton logarithmNaturale; //This is for the ln button AKA the natural logarithm button -SHORTER NAME PLEASE!-
	
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
		
		this.multiplyButton = new JButton("*");
		this.addButton = new JButton("+");
		this.subtractButton = new JButton("-");
		this.divideButton = new JButton("/");
		
		this.logButton = new JButton("log");
		this.raiseByPower = new JButton("^");
		this.logarithmNaturale = new JButton("ln");
		
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
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

}
