/*
 * Evgeniy Petin
 * CSIT - 890
 * Home Work # 9
  */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class Monthly_Tax extends JFrame {

	final double STATE_TAX = 0.04;
	final double COUNTY_TAX = 0.02;
	
	private JPanel panel;
	
	private JLabel lblSales;
	private JTextField totalSales;
	private JLabel lblcounty;
	private JTextField countyTax;
	private JLabel lblState;
	private JTextField stateTax;
	private JLabel lblTotalTax;
	private JTextField totalTax;
	private JLabel errMsg;
	
	private JButton btnCalculate;
	
	
	//private JButton retailPrice;
	
	
	public Monthly_Tax()
	{
		panel = new JPanel();
		
		lblSales = new JLabel("Enter Total Sales:");
		totalSales = new JTextField(10);
		
		lblcounty = new JLabel("County Tax:");
		countyTax = new JTextField(10);
		countyTax.setEnabled(false);
		countyTax.setDisabledTextColor(Color.BLACK);
		
		lblState = new JLabel("State Tax:");
		stateTax = new JTextField(10);
		stateTax.setEnabled(false);
		stateTax.setDisabledTextColor(Color.BLACK);
		
		lblTotalTax = new JLabel("Total Tax:");
		totalTax = new JTextField(10);
		totalTax.setEnabled(false);
		totalTax.setDisabledTextColor(Color.BLACK);
		
		errMsg = new JLabel("Invalid Input, please try again");
		errMsg.setForeground(Color.RED);
		errMsg.setVisible(false);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new btn_Click());
		
		
		panel.add(lblSales);
		panel.add(totalSales);
		panel.add(lblcounty);
		panel.add(countyTax);
		panel.add(lblState);
		panel.add(stateTax);
		panel.add(lblTotalTax);
		panel.add(totalTax);
		panel.add(errMsg);
		panel.add(btnCalculate);
		
		
		this.getContentPane().add(panel);
		this.setSize(250, 200);
		this.setLocation(300, 200);
		this.setTitle("Sales Tax Calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private class btn_Click implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			errMsg.setVisible(false);
			totalSales.setBackground(Color.WHITE);
			// TODO Auto-generated method stub
			double sales=0.0;
			
			try
			{
				sales = Double.parseDouble(totalSales.getText());
			}
			catch(NumberFormatException ex)
			{
				errMsg.setVisible(true);
				totalSales.setBackground(Color.YELLOW);
				totalSales.requestFocus();
				return;
			}
			totalSales.requestFocus();
			//Double asd ;
			DecimalFormat df = new DecimalFormat("0.00");
			
			Double cTax = sales*COUNTY_TAX;
			Double sTax = sales*STATE_TAX;
			double tTax = cTax+sTax;
			
			countyTax.setText(df.format(cTax));
			stateTax.setText(df.format(sTax));
			totalTax.setText(df.format(tTax));
			//stateTax
			//totalTax
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monthly_Tax frmMain = new Monthly_Tax();
	}

}
