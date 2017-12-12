import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class CeasarOutputStream {
	
	private FileOutputStream foStream;
	private DataOutputStream doStream;
	
	public CeasarOutputStream(String filename) throws FileNotFoundException
	{
		foStream = new FileOutputStream(filename);
		doStream = new DataOutputStream(foStream);
	}
	
	public void write(char c) throws IOException
	{
		//writes one character to the file
		DataOutputStream doStream = new DataOutputStream(this.foStream);
		doStream.writeChar(c);
	}
	public void writeString(String str) throws IOException
	{
		//writes a string to the file
		DataOutputStream doStream = new DataOutputStream(this.foStream);
		doStream.writeChars(str);
	}
	
	public void writeLine(String str) throws IOException
	{
		//writes a string to the file and adds a new line character (encrypted)
		//DataOutputStream doStream = new DataOutputStream(this.foStream);
		str +='\n';
		doStream.writeUTF(str);
	}
	public void closeStream() throws IOException
	{
		//this.doStream.close();
		this.foStream.close();
		this.doStream.close();
	}
}
