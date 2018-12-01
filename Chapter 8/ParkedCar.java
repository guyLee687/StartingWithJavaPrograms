
//Jeffrey Wang 
//11.17.18	

/** 8.8-1: The ParkedCar Class: This class should simulate a parked car. 
The class's reposnsiblities are follows: 
    - To know the car's make, model, color, license number, 
       and the number of mintues that the car has been parked.
 */

public class ParkedCar
{
	private String carMake, carModel, carColor, 
					carLicense;
	private int parkedMin;

	public ParkedCar()
	{
		carMake = "";
		carModel = "";
		carColor = "";
		carLicense = "";
		parkedMin = 0;
	}

	public ParkedCar(String carMake, String carModel, String carColor, 
					String carLicense, int parkedMin)
	{
		this.carMake = carMake;
		this.carModel = carModel;
		this.carColor = carColor;
		this.carLicense = carLicense;
		this.parkedMin = parkedMin;
	}

	public ParkedCar(ParkedCar car)
	{
		this.carMake = car.carMake;
		this.carModel = car.carModel;
		this.carColor = car.carColor;
		this.carLicense = car.carLicense;
		this.parkedMin = car.parkedMin;
	}

	public void setCarMake(String carMake) 
	{
		this.carMake = carMake;
	}

	public void setCarModel(String carModel)
	{
		this.carModel = carModel;
	}

	public void setCarColor(String carColor)
	{
		this.carColor = carColor;
	}

	public void setCarLicense(String carLicense)
	{
		this.carLicense = carLicense;
	}

	public void setParkedMin(int parkedMin)
	{
		this.parkedMin = parkedMin;
	}

	public String getCarMake() 
	{
		return carMake;
	}

	public String getCarModel()
	{
		return carModel;
	}

	public String getCarColor()
	{
		return carColor;
	}

	public String getCarLicense()
	{
		return carLicense;
	}

	public int getParkedMin()
	{
		return parkedMin;
	}

	public String toString()
	{
		return "Car Make: " + carMake + 
			 	"\nCar Model: " + carModel + 
			 	  "\nCar Color: " + carColor + 
			  		"\nCar License: " + carLicense + 
			    	  "\nParked Minutes: " + parkedMin; 
	}
}