package calculus.view;

import javax.swing.JFrame;
import calculus.controller.CalculusController;

public class CalcFrame extends JFrame
{
	private CalculusController theController;
	private CalcPanel thePanel;
	
	public CalcFrame(CalculusController theController, CalcPanel thePanel)
	{
		super();
		this.theController = theController;
		this.thePanel = thePanel;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(thePanel);
		this.setSize(900,900);
		this.setTitle("Calculus Calculator");
		this.setResizable(true);
		this.setVisible(true);
	}
}
