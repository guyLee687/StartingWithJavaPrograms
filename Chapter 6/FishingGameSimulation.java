
//Jeffrey Wang 
//11.15.18

/**
6.14 Fishing Game Simulation: For this assignment, you will write a program that simulates a fishing game. In this game, a six-sided die is rolled to 
determine what the user has caught. The points will remain hidden until the user is finished fishing, and then a message is displayed congratualating the user, depending on the number of fishing points gained. 

- Each round of the game is performed as an iteration of a loop that repeats as long as
the player wants to fish for more items. 
- At the beginning of each round, the program will ask the user whether or not he or she wants to continue fishing. 
- The program simuates the rolling of a six-sided (use the Die class)
- Each item the user catches is worth a different amount of points. 
- The loop keeps a running total of the user's fishing points. 
- After the loop has finsihed, the total number of fishing points is displayed, along with a message that varies depending on the number of points earned.
*/

public class FishingGameSimulation 
{
	private int points;
	private int trash = 0, shad = 0, salmon = 0, 
					trout = 0, sunfish = 0, pike = 0;
	private int reel;

	private final int SIDES = 6; 		//dice sides for randomization.

	public FishingGameSimulation()
	{
		System.out.println("You have started Jeff's fishing game!");
		System.out.println("Here are the rulesofplaying: \n"
			 + "fish() -- to throw your pole \nreel() -- to reel your pole" 
			 + "\ndock() -- to see your total points." );
		points = 0;
		reel = 0;
	}

	public void fish()
	{
		Die dice = new Die(SIDES);
		System.out.println("You threw your pole into the water...\n");
		reel = dice.getValue();
	}

	public void reel()
	{
		System.out.println("You caught a " + categorize(reel));
	}

	public void dock()
	{
		System.out.println("\n You've docked you're boat. Your total score is: ");
		System.out.printf("\n %-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t", "trash (0pts)", "shad (1pt)", 
			"salmon (2pts)", "trout (3pts)", "sunfish (4pts)", "pike (5pts)");
		System.out.println("\n----------------------------------------------------------------------------------------------------");
		System.out.printf(" %-25d\t%-25d\t%-25d\t%-25d\t%-25d\t%-25d\t", trash, shad, 
			salmon, trout, sunfish, pike);
		System.out.println("\n\n total: " + shad + (salmon *2) + (trout * 3) + (sunfish *4) + (pike * 5));
	}

	private String categorize (int rand)
	{
		switch(rand)
		{
			case 1: 
				trash++; 
				return "trash. You've gained 0 pts.";
			case 2:
				shad++;
				return "shad. You've gained 1 pt.";
			case 3:
				salmon++;
				return "salmon. You've gained 2 pts";
			case 4:
				trout++;
				return "trout. You've gained 3 pts.";
			case 5:
				sunfish++;
				return "sunfish. You've gained 4 pts.";
			case 6:
				pike++;
				return "pike. You've gained 5 pts.";
		}
		return null;
	}
	
}