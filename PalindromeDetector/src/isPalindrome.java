import javax.swing.JOptionPane;


public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true)
		{
			String userInput = JOptionPane.showInputDialog("Please enter a string");
			if(userInput==null)
				System.exit(0);
			char arr[] = userInput.toCharArray();
			boolean ispali = isPaly(arr, 0);
			if(ispali == true)
				JOptionPane.showMessageDialog(null, "Paly");
			else
				
			JOptionPane.showMessageDialog(null, "Not Paly");
		}
	}
	private static boolean isPaly(char[] str, int pos)
	{
		if (str == null || str.length < 2)
			return true;
		
		if(str[pos] != str[str.length-(pos+1)])
		{
			return false;
		}
		
		if(str.length / 2 <= pos)
		{
			isPaly(str, pos+1);
		}
		
			return true;
		
	}
}
