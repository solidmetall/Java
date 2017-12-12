import java.text.DecimalFormat;
import java.util.Formatter;

import javax.swing.JOptionPane;


public class BodyMaxIndex {

	public static void main(String[] args) {

		
		String metricOrImperial ="";
		boolean Valid = false;
		String status ="";
		
			metricOrImperial = JOptionPane.showInputDialog(null, "Please enter \"M\" for Metric or \"I\" for Imperial");
			
			
		
		char MetricOutput = metricOrImperial.charAt(0);
		DecimalFormat formatter = new DecimalFormat("#.##");
		
		String userWeight = "";
		String userHeight = "";
		
		if(MetricOutput == 'M' || MetricOutput == 'm')
		{
			do
			{
				userWeight = JOptionPane.showInputDialog(null, "Please enter your body weigth in Kilogramms");
			 
				if(Double.parseDouble(userWeight) <= 0)
				{
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
			while (Double.parseDouble(userWeight) <= 0);
			
			do
			{
				userHeight = JOptionPane.showInputDialog(null, "Please enter your height in Meters");
			 
				if(Double.parseDouble(userHeight) <= 0)
				{
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
			}
			while (Double.parseDouble(userHeight) <= 0);
			
			
			
			double bmiMetric = Double.parseDouble(userWeight)/(Double.parseDouble(userHeight)*Double.parseDouble(userHeight));
			if (bmiMetric < 18.5)
			{
				status = "Underweight";
			}
			else if(bmiMetric >= 18.5 && bmiMetric <= 25)
			{
				status = "Normal";
			}
			else if(bmiMetric > 25 && bmiMetric < 30)
			{
				status = "Overweight";
			}
			else if (bmiMetric >= 30)
			{
				status = "Obese";
			}
			
			
			JOptionPane.showMessageDialog(null, "Your BMI is: "+ formatter.format(bmiMetric) + ". Your Weight is: "+ status);
		}
		
		else if(MetricOutput == 'I' || MetricOutput == 'i')
		{
			do{
				userWeight = JOptionPane.showInputDialog(null, "Please enter your body weigth in Pounds");
				if(Double.parseDouble(userWeight) <= 0)
				 {
					 JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				 }
			}
			while (Double.parseDouble(userWeight) <= 0);
			
			do
			{
			 userHeight = JOptionPane.showInputDialog(null, "Please enter your height in Inches");
			 if(Double.parseDouble(userHeight) <= 0)
			 {
				 JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
			 }
			}
			while (Double.parseDouble(userHeight) <= 0);
			
			double bmiImperial = (Double.parseDouble(userWeight)/(Double.parseDouble(userHeight)*Double.parseDouble(userHeight)))*703;
			
			if (bmiImperial < 18.5)
			{
				status = "Underweight";
			}
			else if(bmiImperial >= 18.5 && bmiImperial <= 25)
			{
				status = "Normal";
			}
			else if(bmiImperial > 25 && bmiImperial < 30)
			{
				status = "Overweight";
			}
			else if (bmiImperial >= 30)
			{
				status = "Obese";
			}
			
			JOptionPane.showMessageDialog(null, "Your BMI is: "+ formatter.format(bmiImperial) + ". Your Weight is: "+ status);
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Input, please restart program and try again");
		}
	}

}
