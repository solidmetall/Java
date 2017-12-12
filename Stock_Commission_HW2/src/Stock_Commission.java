import javax.swing.JOptionPane;

/**This is class of Stock_Commission**/
public class Stock_Commission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String SharesPurchased;
		//shares purchased, the price per share, and the commission percentage.
		String PricePerShare, Commission;
		
		SharesPurchased = JOptionPane.showInputDialog("Please enter number of purchased shares: ");
		PricePerShare = JOptionPane.showInputDialog("Please enter price per share: ");
		Commission = JOptionPane.showInputDialog("Please enter commission: ");
		
		String msg = "";
		msg +="Shares Purchased: "+ SharesPurchased +"\nPrice paid per share: "+PricePerShare+
				"\nCommissions: "+Commission;
		
		/*int Shares = Integer.parseInt("SharesPurchased");
		int Price = Integer.parseInt("PricePerShare");
		int Comm = Integer.parseInt("Commission");*/
		
		 JOptionPane.showMessageDialog(null, msg);
	}

}
