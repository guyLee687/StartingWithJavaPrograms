
//Jeffrey Wang 
//11.17.18

/** 8.8-2: The parkingMeter Class: This class should simulate a parking meter. 
The class's only responsible is as follows:
    - To know the number of minutes of parking time that has be purchased. 
*/

public class ParkingMeter
{
	private int minutes;
	
	public ParkingMeter()
	{
		minutes = 0;
	}

	public ParkingMeter(int minutes)
	{
		this.minutes = minutes;
	}

	public ParkingMeter(ParkingMeter meter)
	{
		this.minutes = meter.minutes;
	}

	public void setParkingMeter(int minutes)
	{
		this.minutes = minutes;
	}

	public int getParkingMeter()
	{
		return minutes;
	}

	public String toString()
	{
		return "Total Minutes Parked: " + minutes;
	}
}