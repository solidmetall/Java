//Petin Evgeniy
//CSIT - 890

import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class SpeedOfSoundCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String DistanceMeasure ="";
		
		boolean Valid = false;
		boolean isNumber = false;
		//String status ="";
		//feet, miles, meters, or kilometers
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		DecimalFormat TimeFormatter = new DecimalFormat("#.##");
		String UsersInput = "";
		double EnteredNumber=0;
		double AmountOfTime;
		double days, hours, minutes, seconds;
		
		//JOptionPane.showMessageDialog(null, formatter.format(UsersInput));
		
		do {
			DistanceMeasure = JOptionPane.showInputDialog(null, "Please enter distance measure Unit:\n\"M\" for Meters,\n\"Mi\" for Miles,\n"
					+ "\"Km\" for Kilometers,\n\"Ft\" for Feet.");
			
			DistanceMeasure = DistanceMeasure.toLowerCase();

			if (DistanceMeasure.equalsIgnoreCase("m")) 
			{
				do
				{
					isNumber = true;
					UsersInput = JOptionPane.showInputDialog(null, "Please enter the distance in Meters: ");
					
					try  
					  {  
					    EnteredNumber = Double.parseDouble(UsersInput);  
					  }  
					  catch(NumberFormatException Ex)  
					  {  
						  isNumber = false;
						  JOptionPane.showMessageDialog(null, "You have entered not a Number, please try again!");
					  }  
				}
				while (!isNumber);
				
				Valid = true;
				DistanceMeasure = "Meters";
				
				seconds = EnteredNumber/343.59;
				
				
				days = Math.floor(seconds/86400);
				if(days >= 1)
				{
					seconds-= days*86400;
				}
				
				hours = Math.floor(seconds / 3600);
				if(hours >= 1)
				{
					seconds -= hours*3600;
				}
				minutes = Math.floor(seconds/60);
				if(minutes>=1)
				{
					seconds-=minutes*60;
				}
				
				
				if(days>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Meters\n"
							+ "The speed of sound is 343.59 meters per second.\n"
							+ "It will take "+TimeFormatter.format(days)+" Days, "+TimeFormatter.format(hours)+" Hours, "
							+TimeFormatter.format(minutes)+" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
					
					/*JOptionPane.showMessageDialog(null, "Days: "+days+" Hours: "+hours+" Minutes: "+TimeFormatter.format(minutes)+" Seconds: "
							+TimeFormatter.format(seconds));*/
				}
				else if(hours>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Meters\n"
							+ "The speed of sound is 343.59 meters per second.\n"
							+ "It will take "+TimeFormatter.format(hours)+" Hours, "
							+TimeFormatter.format(minutes)+" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				else if(minutes>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Meters\n"
							+ "The speed of sound is 343.59 meters per second.\n"
							+ "It will take "+TimeFormatter.format(minutes)+
							" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Meters\n"
							+ "The speed of sound is 343.59 meters per second.\n"
							+ "It will take "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				
				
					/*JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Meters\n"
							+ "The speed of sound is 343.59 meters per second.\n"
							+ "It will take "+seconds+" Seconds - for sound to travel this distance.");*/
			
				
			} 
			
			else if (DistanceMeasure.equalsIgnoreCase("mi")) 
			{
				do
				{
					isNumber = true;
					UsersInput = JOptionPane.showInputDialog(null, "Please enter the distance in Miles: ");
					
					try  
					  {  
					    EnteredNumber = Double.parseDouble(UsersInput);  
					  }  
					  catch(NumberFormatException Ex)  
					  {  
						  isNumber = false;
						  JOptionPane.showMessageDialog(null, "You have entered not a Number, please try again!");
					  }  
				}
				while (!isNumber);
				
				Valid = true;
				DistanceMeasure = "Miles";
				
				seconds = EnteredNumber/0.2134;
				
				
				days = Math.floor(seconds/86400);
				if(days >= 1)
				{
					seconds-= days*86400;
				}
				
				hours = Math.floor(seconds / 3600);
				if(hours >= 1)
				{
					seconds -= hours*3600;
				}
				minutes = Math.floor(seconds/60);
				if(minutes>=1)
				{
					seconds-=minutes*60;
				}
				
				
				if(days>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Miles\n"
							+ "The speed of sound is 0.2134 Mile per second.\n"
							+ "It will take "+TimeFormatter.format(days)+" Days, "+TimeFormatter.format(hours)+" Hours, "
							+TimeFormatter.format(minutes)+" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
					
					/*JOptionPane.showMessageDialog(null, "Days: "+days+" Hours: "+hours+" Minutes: "+TimeFormatter.format(minutes)+" Seconds: "
							+TimeFormatter.format(seconds));*/
				}
				else if(hours>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Miles\n"
							+ "The speed of sound is 0.2134 Mile per second.\n"
							+ "It will take "+TimeFormatter.format(hours)+" Hours, "
							+TimeFormatter.format(minutes)+" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				else if(minutes>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Miles\n"
							+ "The speed of sound is 0.2134 Mile per second.\n"
							+ "It will take "+TimeFormatter.format(minutes)+
							" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Miles\n"
							+ "The speed of sound is 0.2134 Mile per second.\n"
							+ "It will take "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				
				
					/*JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Meters\n"
							+ "The speed of sound is 343.59 meters per second.\n"
							+ "It will take "+seconds+" Seconds - for sound to travel this distance.");*/
			
				
			} 
			
			else if (DistanceMeasure.equalsIgnoreCase("km")) 
			{
				do
				{
					isNumber = true;
					UsersInput = JOptionPane.showInputDialog(null, "Please enter the distance in Kilometers: ");
					
					try  
					  {  
					    EnteredNumber = Double.parseDouble(UsersInput);  
					  }  
					  catch(NumberFormatException Ex)  
					  {  
						  isNumber = false;
						  JOptionPane.showMessageDialog(null, "You have entered not a Number, please try again!");
					  }  
				}
				while (!isNumber);
				
				Valid = true;
				DistanceMeasure = "Kilometers";
				
				seconds = EnteredNumber/0.3434;
				
				
				days = Math.floor(seconds/86400);
				if(days >= 1)
				{
					seconds-= days*86400;
				}
				
				hours = Math.floor(seconds / 3600);
				if(hours >= 1)
				{
					seconds -= hours*3600;
				}
				minutes = Math.floor(seconds/60);
				if(minutes>=1)
				{
					seconds-=minutes*60;
				}
				
				
				if(days>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Kilometers\n"
							+ "The speed of sound is 0.3434 Kilometer per second.\n"
							+ "It will take "+TimeFormatter.format(days)+" Days, "+TimeFormatter.format(hours)+" Hours, "
							+TimeFormatter.format(minutes)+" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
					
					/*JOptionPane.showMessageDialog(null, "Days: "+days+" Hours: "+hours+" Minutes: "+TimeFormatter.format(minutes)+" Seconds: "
							+TimeFormatter.format(seconds));*/
				}
				else if(hours>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Kilometers\n"
							+ "The speed of sound is 0.3434 Kilometers per second.\n"
							+ "It will take "+TimeFormatter.format(hours)+" Hours, "
							+TimeFormatter.format(minutes)+" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				else if(minutes>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Kilometers\n"
							+ "The speed of sound is 0.3434 Kilometers per second.\n"
							+ "It will take "+TimeFormatter.format(minutes)+
							" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Kilometers\n"
							+ "The speed of sound is 0.3434 Kilometers per second.\n"
							+ "It will take "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				
				
					/*JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Meters\n"
							+ "The speed of sound is 343.59 meters per second.\n"
							+ "It will take "+seconds+" Seconds - for sound to travel this distance.");*/
			
				
			} 
			
			else if (DistanceMeasure.equalsIgnoreCase("ft")) 
			{
				do
				{
					isNumber = true;
					UsersInput = JOptionPane.showInputDialog(null, "Please enter the distance in Feets: ");
					
					try  
					  {  
					    EnteredNumber = Double.parseDouble(UsersInput);  
					  }  
					  catch(NumberFormatException Ex)  
					  {  
						  isNumber = false;
						  JOptionPane.showMessageDialog(null, "You have entered not a Number, please try again!");
					  }  
				}
				while (!isNumber);
				
				Valid = true;
				DistanceMeasure = "Feets";
				
				seconds = EnteredNumber/1127;
				
				
				days = Math.floor(seconds/86400);
				if(days >= 1)
				{
					seconds-= days*86400;
				}
				
				hours = Math.floor(seconds / 3600);
				if(hours >= 1)
				{
					seconds -= hours*3600;
				}
				minutes = Math.floor(seconds/60);
				if(minutes>=1)
				{
					seconds-=minutes*60;
				}
				
				
				if(days>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Feets\n"
							+ "The speed of sound is 1127 Feets per second.\n"
							+ "It will take "+TimeFormatter.format(days)+" Days, "+TimeFormatter.format(hours)+" Hours, "
							+TimeFormatter.format(minutes)+" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
					
					/*JOptionPane.showMessageDialog(null, "Days: "+days+" Hours: "+hours+" Minutes: "+TimeFormatter.format(minutes)+" Seconds: "
							+TimeFormatter.format(seconds));*/
				}
				else if(hours>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Feets\n"
							+ "The speed of sound is 1127 Feets per second.\n"
							+ "It will take "+TimeFormatter.format(hours)+" Hours, "
							+TimeFormatter.format(minutes)+" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				else if(minutes>=1)
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Feets\n"
							+ "The speed of sound is 1127 Feets per second.\n"
							+ "It will take "+TimeFormatter.format(minutes)+
							" Minutes, "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Feets\n"
							+ "The speed of sound is 1127 Feets per second.\n"
							+ "It will take "+TimeFormatter.format(seconds)+" Seconds - for sound to travel this distance.");
				}
				
				
					/*JOptionPane.showMessageDialog(null, "You have entered "+ formatter.format(EnteredNumber) +" Meters\n"
							+ "The speed of sound is 343.59 meters per second.\n"
							+ "It will take "+seconds+" Seconds - for sound to travel this distance.");*/
			
				
			} 
			
			else 
			{
				JOptionPane.showMessageDialog(null,
						"Invalid Input, please try again");
				Valid = false;
			}
			
		} while (!Valid);
		//JOptionPane.showMessageDialog(null, MetricOutput);
		
		System.exit(0);
	}

}
