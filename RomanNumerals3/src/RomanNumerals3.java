import javax.swing.JOptionPane;


public class RomanNumerals3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = JOptionPane.showInputDialog(
				"Please enter a number 1..10");
		
		int userNumber= Integer.parseInt(userInput);
		
		if(userNumber <1 || userNumber > 10)
		{
			JOptionPane.showMessageDialog(null, "The number you have entered is " +
					"not in the range 1..10.\n"+
					"Please re-run the program and enter a valid number");
			
			
		}
		
		String romanNumber = "";
		
		if (userNumber == 1)
			romanNumber="I";
		else if(userNumber ==2)
			romanNumber="II";
		else if(userNumber ==3)
			romanNumber="III";
		else if(userNumber ==4)
			romanNumber="IV";
		else if(userNumber ==5)
			romanNumber="V";
		else if(userNumber ==6)
			romanNumber="VI";
		else if(userNumber ==7)
			romanNumber="VII";
		else if(userNumber ==8)
			romanNumber="VIII";
		else if(userNumber ==9)
			romanNumber="IX";
		else if(userNumber ==10)
			romanNumber="X";
		
		String msg = "Arabic number is: "+ userNumber;
		msg+= "\nRoman number is "+ romanNumber;
		JOptionPane.showMessageDialog(null, msg);
		System.exit(0);
	}

}
