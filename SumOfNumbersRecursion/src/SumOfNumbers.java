
/*Petin Evgeniy
 * CSIT-890
 * HomeWork #11
 * Chapter 15.
 * PC #8.
 * Sum of Numbers.
 * */

import javax.swing.JOptionPane;


public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean Valid = true;
		while (true)
		{
			int  Number=0;
			Valid = true;
			String userInput = JOptionPane.showInputDialog("Please enter a Number:");
			
			if(userInput==null)
				System.exit(0);
			
			try 
			{
				Number = Integer.parseInt(userInput);
				if(Number<1)
				{
					Valid=false;
					JOptionPane.showMessageDialog(null,"Please enter positive Number");
				}
			}
			catch (NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "Please enter numeric Value");
				Valid = false;
			}
			catch (NullPointerException ex)
			{
				Valid = false;
			}
			
			if(Valid)
			{
				int answer = RecursionSum(0,Number,1);
				JOptionPane.showMessageDialog(null, "Sum of all numbers between 0 and "+Number+" Equals: "+answer);
			}
		}
	}
	public static int RecursionSum(int sum, int num, int pos)
	{
		//JOptionPane.showMessageDialog(null, "Sums is: "+sum+" Number is: "+num+" Position is: "+pos);
		
		if(num == 1)
			return 1;
		
		if (pos <= num)
			return RecursionSum(sum+pos,num, pos+1);
		else
			return sum;
	}
}
