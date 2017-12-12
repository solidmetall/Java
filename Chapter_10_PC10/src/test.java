//Petin Evgeniy
//CSIT - 890
//HomeWork# 7

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String delim = ",";
		String StringToSplit = "";
		String Name, YearBuilt, Type;
		Integer ThirdValue = 0;
		Integer NumberOfLines = 0;
		
		Ship Ships[];
		
		File myFile = new File("Ships.csv");
		Scanner inputFile = new Scanner (myFile);
		
		while(inputFile.hasNext())
		{
			inputFile.nextLine();
			NumberOfLines++;
		}
		inputFile.close();
		
		Ships = new Ship[NumberOfLines];
		inputFile = new Scanner (myFile);
		
		for(int x=0; x<NumberOfLines; x++)
		{
			StringToSplit = inputFile.nextLine();
			StringToSplit = StringToSplit.trim();
			StringTokenizer st = new StringTokenizer(StringToSplit, delim);
			Type = st.nextToken();
			
			if (Type.equals("CargoShip"))
			{
					Name = st.nextToken();
					YearBuilt = st.nextToken();
					ThirdValue = Integer.parseInt(st.nextToken());
					Ships[x] = new CargoShip(Name, YearBuilt, ThirdValue);
			}
			else if(Type.equals("CruiseShip"))
			{
				ThirdValue=0;
				Name = st.nextToken();
				YearBuilt = st.nextToken();
				if(st.hasMoreElements())
				{
					ThirdValue = Integer.parseInt(st.nextToken());
				}
				Ships[x] = new CruiseShip(Name, YearBuilt, ThirdValue);
			}
			else if(Type.equals("Ship"))
			{
				Name = st.nextToken();
				YearBuilt = st.nextToken();
				Ships[x] = new Ship(Name, YearBuilt);
			}
		}
		inputFile.close();
		
		for(int x=0; x<NumberOfLines; x++)
		{
			System.out.println(Ships[x].toString());
		}
	}
}
