import javax.swing.JOptionPane;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean valid = true;
		String Name, Number, HireDate;
		Integer Shift;
		Double PayRate;
		
		do{
		String choice = JOptionPane.showInputDialog("Would you like to create new Employee? Y/N");
		if(choice == null)
		{
			valid = false;
			System.exit(0);
		}
		
		char ch = choice.charAt(0);
		if (ch == 'y' || ch =='Y')
		{
			Name = JOptionPane.showInputDialog("Please enter New Employee Name");
			Number = JOptionPane.showInputDialog("Please enter New Employee Number");
			HireDate = JOptionPane.showInputDialog("Please enter New Employee Hire Date");
			Shift = Integer.parseInt( JOptionPane.showInputDialog("Please enter New Employee Shift"));
			PayRate = Double.parseDouble( JOptionPane.showInputDialog("Please enter New Employee Hourly Wage"));
			
			ProductionWorker Emp1 = new ProductionWorker(Name, Number, HireDate, Shift, PayRate); 
			
			Emp1.Print();
			System.exit(0);
		}
		else if(ch == 'n' || ch =='N')
		{
			valid = false;
			System.exit(0);
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid input Please try again");
		}
		}
		while (valid);
	}

}
