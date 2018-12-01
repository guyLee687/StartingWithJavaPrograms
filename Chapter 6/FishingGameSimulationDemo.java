import java.util.Scanner;

//Jeffrey Wang 
//11.15.18	

//3.14-1 FishingGameSimulationDemo

public 	class FishingGameSimulationDemo
{
	public static void main(String[] args) 
	{
		String action = "";

		FishingGameSimulation newGame = new FishingGameSimulation();
		Scanner keyboard = new Scanner(System.in);

		while (!action.equals("dock()"))
		{
			System.out.println("What is your action");
			action = keyboard.nextLine();

			if (action.equals("fish()"))
				newGame.fish();
			else if (action.equals("reel()"))
				newGame.reel();
			else
				System.out.println("You're action is invalid.");
		}	

		newGame.dock();
	}
}