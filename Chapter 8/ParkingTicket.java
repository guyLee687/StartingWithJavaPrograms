
//Jeffrey Wang
//11.17.18

/**8.8-3 The ParkingTicket class: The class should simulate a parking ticket. The class's responsibilities should follow:
    - To report the make, model, car. etc... of illegal car
    - To report the amount of th fine, which is $25 for first hour and $10 foro each additional hour.
    - To report name and badge number of officer issuing ticket.
*/

public class ParkingTicket
{
	private ParkedCar car;
	private ParkingMeter meter;
	private PoliceOfficer officer;
	private int difference;

	public ParkingTicket(ParkedCar car, ParkingMeter meter, 
								PoliceOfficer officer, int difference)
	{
		this.car = new ParkedCar(car);
		this.meter = new ParkingMeter(meter);
		this.officer = new PoliceOfficer(officer);
		this.difference = difference;
	}

	public ParkingTicket(ParkingTicket ticket)
	{
		this.car = ticket.car;
		this.meter = ticket.meter;
		this.officer = ticket.officer;
		this.difference = ticket.difference;
	}

	public ParkedCar getParkedCar()
	{
		return new ParkedCar(car);
	}

	public ParkingMeter getParkingMeter()
	{
		return new ParkingMeter(meter);
	}

	public PoliceOfficer getPoliceOfficer()
	{
		return new PoliceOfficer(officer);
	}

	public String reportIllegalCar()
	{
		return "" + car;
	}

	public String reportFines()
	{
		if (difference > 0)
			return "$" + 25 + (10 * (difference - 1)); 
		else 
			return "$0.00";
	}

	public String reportOfficer()
	{
		return "" + officer;
	}

	public String toString()
	{
		return car + "\n--------------------"
			 + "\n Fines: " + reportFines() + "\n--------------------\n"
			 + officer;
	}
}