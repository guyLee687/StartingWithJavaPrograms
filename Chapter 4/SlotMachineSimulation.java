import java.util.Scanner;
import java.util.Random;
import java.lang.Object;
import java.util.Scanner;

//Jeffrey Wang
//11.12.18

/**
4.21 Slot Machine Simulation: Create a program that simulates a slot machine: 
- ASk the user to enter the amount of money into the machine
- Instead of displaying iamges, the program will select random words 
	(Cheeries, Oranges, Plums, Bells, Melons, Bars)
- To select a word, the program can generate a random number in the range of 0 - 5
- If none of the randomly selected words match, the users wins $0. If two words match
  the user wins 2 times as much. If the three words match, the user wins 3 times as much
- The program will ask whether the user wants to play again. If not display winnings.
*/

public class SlotMachineSimulation
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner keyboard = new Scanner(System.in);

		for (int k = 1; k < 100; k++) 
		{
			System.out.println("\n.\n.");
		}
		
		System.out.println("You have started to a Slot Machine Game. " + 
					"Will you continue?<yes/no> ");	

		if (keyboard.nextLine().equals("yes"))
			System.out.println("You have been warned");
		else 
			System.exit(0);

		System.out.println("Insert your ingame budget: $");
		int budget = keyboard.nextInt();
		while (budget <= 5000)
		{
			System.out.println("Buy in must be greater than 5,000: ");
			budget = keyboard.nextInt();
		}

		int accumulator = 0;
		String again;
		do  
		{
			System.out.println("How much would you like to wager: ");
			int wager = keyboard.nextInt();
				if (wager > budget)
				{
					System.out.println("Wager is greater then budget. Re-enter a legitmate wager:");
					wager = keyboard.nextInt();
				}

			budget -= wager;

			Random randomNumber = new Random();
			int one = -1, two = -1, three = -1;

			System.out.print("Your images are: ");

			for(int i = 0; i < 3; i++)
			{
				int rand = randomNumber.nextInt(6);
				String word = " ";
				
				switch (i)
				{
					case 0: 
						one = rand;
						break;
					case 1: 
						two = rand;
						break;
					case 2:
						three = rand;
						break;
				}
			
				switch (rand)
				{ 
					case 0:
						word = "cherries";
						break;
					case 1: 
						word = "Oranges";
						break;
					case 2: 
						word = "Plums";
						break;
					case 3:
						word = "Bells";
						break;
					case 4: 
						word = "Melons";
						break;
					case 5: 
						word = "Bars";
						break;
				}

				System.out.print(word + ", ");
			}
			
			int multipler = 0; 
			if ((one == two) && (two == three))
				multipler = 3;
			else if ((one == two) || (two == three) || (one == three))
				multipler = 2;

			System.out.println("\n You matched " + multipler + " images.");
			System.out.println("You won " + wager*multipler + " dollars");
		
			accumulator = wager*multipler;
			budget = budget + (wager*multipler); 

			System.out.println("Your remaining budget is: $" + budget);
			System.out.println("Would you like to play again? <yes/no> ");

			keyboard.nextLine();
			again = keyboard.nextLine();

		}while(!(again.equals("no")));
		
		System.out.println("\n\n\n\n\n");
		System.out.println("Ending Budget\t\tAccumulated Winning\t\t");
		System.out.println("--------------------------------------------------------------------------------------"); 
		System.out.println(budget + "\t\t" + accumulator);
	}
}