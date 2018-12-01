import java.util.ArrayList;
//Jeffrey Wang
//11.17.18

/**8.8-4 The Police Officer Class: This class should simulate a police officer inspecting parked cars. 
The class's resposibilies are as follows:
    - To know the officer's name and badge number
    - To examine a Parked Car object and a Parking Meter object,
     and determine whether the car's time has expired. 
    - To issue a parking ticket (genertre a Parkcing Ticket object) 
    if the car's time has expired).
*/

public class PoliceOfficer
{
	private String name; 
	private String badgeNum;
	private ParkedCar car;
	private ParkingMeter meter;
	private ArrayList<ParkingTicket> tickets = new ArrayList<>();

	public PoliceOfficer(String name, String badgeNum, 
							ParkedCar car, ParkingMeter meter)
	{
		this.name = name;
		this.badgeNum = this.badgeNum;
		this.car = new ParkedCar(car);
		this.meter = new ParkingMeter(meter);
	}

	public PoliceOfficer(ParkedCar car, ParkingMeter meter)
	{
		this("Unknown", "Unknown", car, meter);
	}

	public PoliceOfficer(String name, String badgeNum)
	{
		this.name = name;
		this.badgeNum = badgeNum;
	}

	public PoliceOfficer(PoliceOfficer officer)
	{
		this.name = officer.name;
		this.badgeNum = officer.badgeNum;
		this.car = officer.car;
		this.meter = officer.meter;
	}

	public boolean examineCar()
	{
		if (car.getParkedMin() > meter.getParkingMeter())
			return true;
		else 
			return false;
	}

	public void assignTicket()
	{
		System.out.println("The officer " + name + " is know assigning a ticket");
		int difference = car.getParkedMin() - meter.getParkingMeter(); 
			if (difference < 0)
				difference = 0;
		tickets.add(new ParkingTicket(car, meter, this, difference));
	}

	public ArrayList<ParkingTicket> getTickets()
	{
		return new ArrayList<ParkingTicket>(tickets);
	}

	public ParkingTicket getTickets(int position)
	{	
		return new ParkingTicket(tickets.get(position)); 
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setBadgeNum(String badgeNum)
	{
		this.badgeNum = badgeNum;
	}

	public String getName()
	{
		return name;
	}

	public String getBadgeNum()
	{
		return badgeNum;
	}

	public void setParkedCar(ParkedCar car)
	{
		this.car = new ParkedCar(car);
	}

	public void setParkingMeter(ParkingMeter meter)
	{
		this.meter = new ParkingMeter(meter);
	}

	public ParkedCar getParkedCar()
	{
		return new ParkedCar(car);
	}

	public ParkingMeter getParkingMeter()
	{
		return new ParkingMeter(meter);
	}
}
