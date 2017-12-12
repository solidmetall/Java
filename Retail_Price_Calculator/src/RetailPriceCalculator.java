import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class RetailPriceCalculator extends JFrame {

	private JPanel panel;
	private JLabel costLabel;
	private JTextField wholesaleCost;
	private JLabel markupLabel;
	private JTextField markup;
	private JButton retailPrice;
	private JLabel errorMessage;
	
	public RetailPriceCalculator()
	{
		panel = new JPanel();
		costLabel = new JLabel("Wholesale Cost ($):");
		wholesaleCost = new JTextField(10);
		markupLabel = new JLabel("Markup (%):");
		markup = new JTextField(10);
		retailPrice = new JButton("Calculate Retail Price");
		errorMessage = new JLabel("Please correct the field entry below (In Red)");
		errorMessage.setBackground(Color.YELLOW);
		errorMessage.setForeground(Color.RED);
		errorMessage.setVisible(false);
		
		retailPrice.addActionListener(new RetailButtonListener()); //Attaches handler to button
		
		panel.add(errorMessage);
		panel.add(costLabel);
		panel.add(wholesaleCost);
		panel.add(markupLabel);
		panel.add(markup);
		panel.add(retailPrice);
		
		this.getContentPane().add(panel);
		this.setSize(250, 150);
		this.setLocation(300, 200);
		this.setTitle("Retail price Calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RetailPriceCalculator MainWin = new RetailPriceCalculator();

	}
	
	private class RetailButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double cost=0.0;
			double markupPercent=0.0;
			
			try
			{
				cost = Double.parseDouble(wholesaleCost.getText());
			}
			catch(NumberFormatException ex)
			{
				errorMessage.setVisible(true);
				wholesaleCost.setBackground(Color.YELLOW);
				wholesaleCost.setText("");
				wholesaleCost.setFocusable(true);
				wholesaleCost.requestFocus();
				return;
			}
			
			wholesaleCost.setBackground(Color.WHITE);
			
			try
			{
				markupPercent = Double.parseDouble(markup.getText());
			}
			catch(NumberFormatException ex)
			{
				errorMessage.setVisible(true);
				markup.setBackground(Color.YELLOW);
				markup.setText("");
				markup.setFocusable(true);
				markup.requestFocus();
				return;
			}
			
			errorMessage.setVisible(false);
			markup.setBackground(Color.WHITE);
			
			double price = (1+markupPercent / 100.0)*cost;
			JOptionPane.showMessageDialog(null, "Retail Price = " + price);
		}
		
	}

}
