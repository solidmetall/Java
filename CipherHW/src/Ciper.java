import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.Line;
import javax.swing.JOptionPane;


public class Ciper {

	//static String AllCharsSupported = "abcdefghijklmnopqrstuvwxyz1234567890,.!?()'- ";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//JOptionPane.showMessageDialog(null, "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ1234567890,.!?()'- @#$%^&*-+/\\|");
		//int NumOfCar = AllCharsSupported.length();
		//int Displacement = 13;
		
		//String EorCString = "";
		String UserInput = "";
		
		boolean Valid = false;
		//char FirstChar;
		//char CharPhrase[];
		
		do
		{
		String EorC = JOptionPane.showInputDialog("Would you like to Read or Write to Encrypted File?\nEnter R for Read or W to Write");
		
		if(EorC == null)
		{
			System.exit(0);
		}
		else if(EorC.length() == 0)
		{
			JOptionPane.showMessageDialog(null, "Cannot be Empty");
		}
		else if(EorC.charAt(0) == 'R' ||EorC.charAt(0) == 'r')
		{
			Valid = true;
			String file = JOptionPane.showInputDialog("Please Enter FileName to Read");
			//file+=".dat";
			
			CeasarInputStream readingFile = new CeasarInputStream(file);
			
			String DecryptedLine = Decrypt(readingFile.readLine());
			JOptionPane.showMessageDialog(null, DecryptedLine);
			//Encrypt();
		}
		else if(EorC.charAt(0) == 'W' ||EorC.charAt(0) == 'w')
		{
			Valid = true;
			String file = JOptionPane.showInputDialog("Please Enter FileName to Write to");
			CeasarOutputStream writeFile = new CeasarOutputStream(file);
			String line = "";
			do
			{
			line = JOptionPane.showInputDialog("Please Enter Line to Write to file, or type Ex to stop");
			//file+=".dat";
			if(line.equals("Ex") == true || line.equals("ex") == true)
			{
				break;
			}
			
			File f = new File(file);
			
			if(f.exists())
			{
				f.delete();
				f.createNewFile();
			}
			else
			{
				f.createNewFile();
			}
			
			JOptionPane.showMessageDialog(null, Encrypt(line));
			writeFile.writeLine(Encrypt(line));
			}
			while (true);
			//Decrypt();
			writeFile.closeStream();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Input, please try again");
		}
		}
		while(!Valid);
	}
	
	protected static String Decrypt(String LineToDecrypt)
	{
		/*String msg = "";
		char chars[] = LineToDecrypt.toCharArray();
		int buffer[] = new int [chars.length];
		
		for(int x=0; x<chars.length;x++)
		{
			buffer[x] = ((int)chars[x])+13;
		}
		
		for(int x=0; x<chars.length;x++)
		{
			msg+=(char)buffer[x];
		}*/
		
		String AllCharsSupported = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ1234567890,.!?()'- @#$%^&*-+/\\|";
		String StringPhrase;
		char PH[];
		char ALL[];
		ALL=AllCharsSupported.toCharArray();
		boolean found = false;
		int indx = -1;
		
		String msg = "";
		
		do
		{
			StringPhrase = LineToDecrypt;
			//StringPhrase = StringPhrase.toLowerCase();
			
			if(StringPhrase.length() == 0)
			{
				JOptionPane.showMessageDialog(null, "Cannot be empty");
			}
		}
		while(StringPhrase.length() == 0);
		
		
		PH = StringPhrase.toCharArray();
		
		for(int x=0; x<StringPhrase.length(); x++)
		{		
			found = false;
			for(int i = 0; i< AllCharsSupported.length(); i++)
			{
				if(PH[x] == ALL[i])
				{
					found = true;
					indx = i;
					break;
				}
			}
			
			if(found)
			{
				if((indx + 13) > (AllCharsSupported.length()-1))
				{
					 msg+= ALL[(indx+13)-(AllCharsSupported.length()-1)];
				}
				else
				{
					msg+= ALL[indx+13];
				}
			}
			else
			{
				msg+=PH[x];
			}
		}
		return msg;		
	}
	
	protected static String Encrypt(String LineToEncrypt)
	{
		
		/*String msg = "";
		char chars[] = LineToEncrypt.toCharArray();
		int buffer[] = new int [chars.length];
		
		for(int x=0; x<chars.length;x++)
		{
			buffer[x] = ((int)chars[x])-13;
		}
		
		for(int x=0; x<chars.length;x++)
		{
			msg+=(char)buffer[x];
		}*/
		
		
		String AllCharsSupported = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ1234567890,.!?()'- @#$%^&*-+/\\|";
		String StringPhrase;
		char PH[];
		char ALL[];
		ALL=AllCharsSupported.toCharArray();
		boolean found = false;
		int indx = -1;
		
		String msg = "";
		
		do
		{
			StringPhrase = LineToEncrypt;
			//StringPhrase = StringPhrase.toLowerCase();
			
			if(StringPhrase.length() == 0)
			{
				JOptionPane.showMessageDialog(null, "Cannot be empty");
			}
		}
		while(StringPhrase.length() == 0);
		
		
		
		PH = StringPhrase.toCharArray();
		
		for(int x=0; x<StringPhrase.length(); x++)
		{		
			found = false;
			for(int i = 0; i< AllCharsSupported.length(); i++)
			{
				if(PH[x] == ALL[i])
				{
					found = true;
					indx = i;
					break;
				}
			}
			
			if(found)
			{
				if((indx - 13) < 0)
				{
					 msg+= ALL[(AllCharsSupported.length() - ((indx - 13)*-1))- 1];
				}
				else
				{
					msg+= ALL[indx-13];
				}
			}
			else
			{
				msg+=PH[x];
			}
		}
		
		return msg;
	}

}
