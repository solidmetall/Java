import java.io.*;
import java.util.Random;

import javax.swing.JOptionPane;
public class FileArray {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String userInput = JOptionPane.showInputDialog("Please enter size of the array: ");
		if (userInput == null)
		{
			System.exit(0);
		}
		
		boolean valid = false;
		int size = 0;
		
		while(!valid)
		{
			try
			{
				size = Integer.parseInt(userInput);
				if(size <=0)
				{
					userInput = JOptionPane.showInputDialog("You Should enter positive number.\nPlease enter size of the array again: ");
				}
				else
				{
					valid=true;
				}
			}
			catch(NumberFormatException ex)
			{
				userInput = JOptionPane.showInputDialog("Invalid Number.\n"+"Please enter size of the array again: ");
				
			}
			if (userInput == null)
			{
				System.exit(0);
			}
		}
		Random rand = new Random();
		int [] myArray = new int[size];
		
		for(int i=0; i<size; i++)
		{
			myArray[i] = rand.nextInt(100);
		}
		
		System.out.println("Integer Array before writing to a file: ");
		for(int i=0; i<size; i++)
		System.out.print(myArray[i] + " ");
		System.out.println();
		
		writeArray("my_integer_array.dat", myArray);
		int[]newArray = readArray("my_integer_array.dat");
		
		System.out.println("Integer Array after writing to a file: ");
		for(int i=0; i<size; i++)
		System.out.print(newArray[i] + " ");
	}
	
	public static void writeArray(String filename, int [] array) throws IOException
	{
		FileOutputStream fstream = new FileOutputStream(filename);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		outputFile.writeInt(array.length);
		for(int i = 0; i<array.length; i++)
		{
			outputFile.writeInt(array[i]);
		}
		outputFile.close();
	}
	
	public static int [] readArray(String filename) throws IOException
	{
		
//		File file = new File(filename);
//		int size = (int)file.length() / 4;
		
		
		int array[];
		int size;
		
		FileInputStream fstream = new FileInputStream(filename);
		DataInputStream outputFile = new DataInputStream(fstream);
		
		size = outputFile.readInt();
		array = new int[size];
		
		
		for(int i =0; i<size; i++)
		{
			array[i] = outputFile.readInt();
		}
		outputFile.close();
		
		return array;
	}
}
