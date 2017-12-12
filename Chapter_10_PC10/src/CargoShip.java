//Petin Evgeniy
//CSIT - 890
//HomeWork# 7

public class CargoShip extends Ship {

	private Integer CargoCapacity;

	public CargoShip(String name, String yearBuilt, Integer cargoCapacity) {
		super(name, yearBuilt);
		CargoCapacity = cargoCapacity;
	}

	public Integer getCargoCapacity() {
		return CargoCapacity;
	}

	public void setCargoCapacity(Integer cargoCapacity) {
		CargoCapacity = cargoCapacity;
	}
	//@Override
	public String toString()
	{
		String msg ="";
		msg += this.getName() +", Built in: "+ this.getYearBuilt()+ ", Maximum Cargo: "+ CargoCapacity+".";
		return msg;
	}
}
