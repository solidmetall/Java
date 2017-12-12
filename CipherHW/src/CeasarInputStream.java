
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JOptionPane;


public class CeasarInputStream 
{
	private FileInputStream fiStream;
	
	public CeasarInputStream(String filename)
	{
			try {
				this.fiStream = new FileInputStream(filename);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "File Not Found");
			}
	}
	
	public char read() throws IOException
	{
		DataInputStream inputFile =
	               new DataInputStream(this.fiStream);
		
		char ch;
		
		 try 
		 {
			ch = inputFile.readChar();
		} 
		 catch (IOException e) 
		 {
			ch = '\0';
		 }
		 finally
		 {
				inputFile.close();
		 }
		return ch;
	}
	
	public String readString(int count) throws IOException
	{
		DataInputStream inputFile =
	               new DataInputStream(this.fiStream);
		char str[] = new char[count-1];
		
		try 
		 {
			for(int x =0; x<count; x++)
			{
				str[x] = inputFile.readChar();
			}
		} 
		 catch (IOException e) 
		 {
			e.printStackTrace();
		 }
		 finally
		 {
				inputFile.close();
		 }
		return str.toString();
	}
	

	public String readLine() throws IOException
	{
		boolean eof = false;
		DataInputStream inputFile = new DataInputStream(this.fiStream);
		String str = "";
		
		while (!eof)
		{
			try 
			{
				//str += inputFile.readLine();
				str += inputFile.readUTF();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
					eof=true;
					inputFile.close();
			}
		}
		return str;
	}
	
	public void closeStream() throws IOException
	{
		this.fiStream.close();
	}
}
