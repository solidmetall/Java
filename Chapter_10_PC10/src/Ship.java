//Petin Evgeniy
//CSIT - 890
//HomeWork# 7

public class Ship {
	
	private String name;
	private String yearBuilt;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getYearBuilt() {
		return yearBuilt;
	}
	
	public void setYearBuilt(String yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	
	public Ship(String name, String yearBuilt) {
		this.name = name;
		this.yearBuilt = yearBuilt;
	}
	
	//@Override
    public String toString() 
    {
    	String msg = "";
    	msg += name;
    	msg +=", Built in: "+ yearBuilt+".";
        return msg;
    }

	
}
