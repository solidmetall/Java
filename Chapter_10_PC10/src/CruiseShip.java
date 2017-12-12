//Petin Evgeniy
//CSIT - 890
//HomeWork# 7

public class CruiseShip extends Ship {
	
	private Integer MaxPassengers;
	
	public CruiseShip(String name, String yearBuilt, Integer maxPassengers) {
		super(name, yearBuilt);
		MaxPassengers = maxPassengers;
	}
	public Integer getMaxPassengers() {
		return MaxPassengers;
	}

	public void setMaxPassengers(Integer maxPassengers) {
		MaxPassengers = maxPassengers;
	}
	//@Override
	public String toString()
	{
		String msg ="";
		msg += this.getName() + ", Built in: "+this.getYearBuilt() +", Maximum Passengers: "+ MaxPassengers+".";
		return msg;
	}
}
