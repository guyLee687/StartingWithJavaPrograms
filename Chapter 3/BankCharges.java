import java.util.Scanner;
//Jeffrey Wang
//11/08/18

/**
A bank charges a base fee of $10 per month, plus the following 
check fees for a commercial checking account: 

- $.10 each for less than 20 checks
- $.08 each for 20-39 checks
- $.06 each for 40-59 checks
- $.04 each for 60+ checks

This program will ask for the number of checks written for the 
month . It should calculate and display the bank's service
fees for the month.
*/

public class BankCharges
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many checks have you written in " + 
						"a month: ");
		int checks = keyboard.nextInt();

		double checkFees = 0;
		if (checks < 20)
			checkFees = 0.10;
		else if ((checks >= 20) && (checks <= 39))
			checkFees = 0.08;			
		else if ((checks >= 20) && (checks <= 39))
			checkFees = 0.06;
		else if (checks >= 60)
			checkFees = 0.04;

		checkFees *= checks;
		System.out.printf("\nYour total check fee for this month " + 
						" is: $%,.2f", checkFees);

	}
}