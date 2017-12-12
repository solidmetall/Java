import javax.swing.JOptionPane;


public class ProductionWorker extends Employee 
{
	private Integer Shift;
	private Double Payrate;
	
	public ProductionWorker(String name, String number, String hireDate,
			Integer shift, Double payrate) 
	{
		super(name, number, hireDate);
		Shift = shift;
		Payrate = payrate;
	}

	public Integer getShift() {
		return Shift;
	}

	public void setShift(Integer shift) {
		Shift = shift;
	}

	public Double getPayrate() {
		return Payrate;
	}

	public void setPayrate(Double payrate) {
		Payrate = payrate;
	}
	
	public void Print()
	{
		String msg="";
		msg += "New Employee name: " + this.getName() + "\n";
		msg += "New Employee Number: " + this.getNumber() + "\n";
		msg += "New Employee Hire Date: " + this.getHireDate() + "\n";
		msg += "New Employee shift: " + Shift + "\n";
		msg += "New Employee Hourly Wage: " + Payrate + "\n";
		
		JOptionPane.showMessageDialog(null, msg);
		/*
		System.out.println("New Employee name: " + this.getName());
		System.out.println("New Employee Number: " + this.getNumber());
		System.out.println("New Employee Hire Date: " + this.getHireDate());
		System.out.println("New Employee shift: " + Shift);
		System.out.println("New Employee Hourly Wage: " + Payrate);*/
	}

}
