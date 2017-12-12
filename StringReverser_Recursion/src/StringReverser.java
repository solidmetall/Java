import javax.swing.JOptionPane;


public class StringReverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true)
		{
			String userInput = JOptionPane.showInputDialog("Please enter a string");
			if(userInput==null)
				System.exit(0);
			
			String reversedString = reverser(userInput);
			
			JOptionPane.showMessageDialog(null, "Original string: "+userInput+"\nReversed String: "+reversedString);
		}
	}
	private static String reverser(String str)
	{
		if(str.length() < 2)
		return str;
		else
			return reverser(str.substring(1))+str.charAt(0);
	}
}