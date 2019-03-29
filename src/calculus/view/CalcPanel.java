package calculus.view;

import javax.swing.*;
import calculus.controller.CalculusController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcPanel extends JPanel
{
	
	private CalculusController theController;
	private SpringLayout theLayout;
	private JButton multiplyButton;
	private JButton add;
	private JButton subtract;
	private JButton divide;
	private JButton logarithm; //This is supposed to be for ordinary logarithm operations -GET BETTER NAME FOR VARIABLE-
	private JButton raiseByPower; //This is supposed to be for exponentials - GET A BETTER NAME FOR THE VARIABLE-
	private JButton logarithmNaturale; //This is for the ln button AKA the natural logarithm button -SHORTER NAME PLEASE!-
	
	public CalcPanel(CalculusController theController)
	{
		super();
		this.theController = theController;
		
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
