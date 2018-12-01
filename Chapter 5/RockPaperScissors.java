import java.util.Random;
import javax.swing.JOpionPane;

//Jeffrey Wang
//11.14.18

/**5.17 Rock Paper Scissors Game: 
Write a program that lets the user play the game of Rock, Paper, Scissors against the computer.
The program should work as follows.
1. When the program begins, a random number in the range of 1 through 3 is generated.
   If the number is 1, the computer chose rock, etc...
2. The user enters his or her choice.
3. The computer's choice is displayed. 
4. A winner is selected according to standard rules. 
	Rock(1) beats Scissors (3), Paper(2) beats Rock(1), Scissors(3) beats Paper(2)
*/ 

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		int computerPoints = 0;
		int playerPoints = 0;

		JOptionPane.showMessageDialog(null, "You are now playing RockPaperScissors. "
			+ "\n Press the following numbers that corresponds to a choice: " + 
				"1.Rock\t2.Paper\tScissors")
		do
		{
			int computerChoice= computersim();
			String decision = JOptionPane.showInputDialog("1.Rock\t2.Paper\tScissors");
			computersim(computerChoice);

			String result = playerCompare(computerChoice, decision);
			if (result.equals("win"))
				playerPoints++;
			else if (result.equals("loss"))
				computerPoints++;
			JOptionPane.showMessageDialog(null, "You " + result + "!")
		}while (again());

		JOptionPane.showMessageDialog(null, "Computer Points: " + computerPoints + 
				"\n Your Points: " + playerPoints);

		System.exit(0);
	}

	/**
	This method randomly picks an integer from 1-3 to simulate a random
	pick.
	@return A random integer from 1-3
	*/
	public static int computerSim()
	{
		Random rand = new Random();
		return rand.nextInt(3) + 1;
	}

	public static void computerSim(int choice)
	{
		switch(choice)
		{
			case 1:
			JOptionPane.showMessageDialog(null, "The Computer chose rock");
			break;
			case 2:
			JOptionPane.showMessageDialog(null, "The Computer chose paper");
			break;
			case 3:
			JOptionPane.showMessageDialog(null, "The Computer chose scissors");
			break;
		}
0	}

	public static String playerCompare(int computer, int player)
	{
		if (player == computer)
			return "draw";
		else if (((computer == 1) && (player == 3)) || ((computer == 2) && (player == 1))
			((computer == 3) && (player == 2)))
			return "loss";
		else
			return "win";
	}

	public static boolean again()
	{
		String flag = JOpionPane.showInputDialog("Would you like to play another " + 
					"round? <yes/no> ");
		if (flag.equals("yes"))
			return true;
		else 
			return false;
	}
}