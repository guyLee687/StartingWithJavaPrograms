import java.util.ArrayList;
import java.util.Scanner;
//Jeffrey Wang 
//11.17.18

/** 8.8 Parking Ticket Simulator: For this assignment you will design a set of classes that work together to simulate a police officer issuing a parking ticket. You should design the following classes: 
- The ParkedCar Class: This class should simulate a parked car. The class's reposnsiblities are follos: 
    - To know the car's amke, model, color, license number, and the number of mintues that the car has been parked.
- The parkingMeter Class: This class should simulate a parking meter. The class's only responsible is as follows:
    - To know the number of minutes of parking time that has be purchased. 
-The ParkingTicket class: The class should simulate a parking ticket. The class's responsibilities should follow:
    - To report the make, model, car. etc... of illegal car
    - To report the amount of th fine, which is $25 for first hour and $10 foro each additional hour.
    - To report name and badge number of officer issuing ticket.
- The Police Officer Class: This class should simulate a police officer inspecting parked cars. The class's resposibilies are as follows:
    - To know the officer's name and badge number
    - To examine a Parked Car object and a Parking Meter object, and determine whether the car's time has expired. 
    - To issue a parking ticket (genertre a Parkcing Ticket object) if the car's time has expired).
*/

public class ParkingTicketSimulation
{
	public static void main(String[] args) 
	{
		String officerName;
		String officerBadge;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Login(Name): ");
		officerName = keyboard.nextLine();

		System.out.print("Password(BadgeNumber): ");
		officerBadge = keyboard.nextLine();

		PoliceOfficer officer = new PoliceOfficer(officerName, officerBadge);

		System.out.println("\n-------------------------------");
		System.out.println("Reporting Parking Ticket");
		System.out.print("Car Make: ");
		String make = keyboard.nextLine();

		System.out.print("Car Model: ");
		String model = keyboard.nextLine();
		System.out.print("Car License: ");
		String license = keyboard.nextLine();
		System.out.print("Car Color: ");
		String color = keyboard.nextLine();	
		System.out.print("Car Minute: ");
		int minute = keyboard.nextInt();

		keyboard.nextLine();
		ParkedCar car = new ParkedCar(make, model, color, license, minute);

		System.out.println("\n--------------------------------");
		System.out.print("Parking Meter: ");
		int meterMin = keyboard.nextInt();

		keyboard.nextLine();

		ParkingMeter meter = new ParkingMeter(meterMin);
		officer.setParkedCar(car);
		officer.setParkingMeter(meter);

		for(int i = 0; i <= 3; i++)
			System.out.println("..."); 

		if (officer.examineCar())
		{
			officer.assignTicket();
			ParkingTicket ticket = officer.getTickets(0);

			System.out.println("Here is your ticket: ");
			System.out.println(ticket);
		}
		else
			System.out.println("Car is parked Legally");

	}
}