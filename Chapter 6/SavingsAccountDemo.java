import java.io.*;
import java.util.Scanner;

//Jaffrey Wang
//11.15.18

//6.10-1 Savings Account Demo

public class SavingsAccountDemo
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("You are using a SavingsAccountDemo");
		System.out.print("Give me the names of the Deposit file for " + 
			"the first month: ");

		File deposit1 = new File (keyboard.nextLine());

		if (!deposit1.exists())
		{
			System.out.println("\n The file doesn't exits.");
			System.exit(0);
		}

		System.out.print("Give me the names of the Withdrawl file for " + 
			"the second month: ");

		File withdrawl1 = new File (keyboard.nextLine());

		if (!withdrawl1.exists())
		{
			System.out.println("\n The file doesn't exits.");
			System.exit(0);
		}

		System.out.println("\n What is the starting balance: ");
		double balance = keyboard.nextDouble();

		System.out.println("What is the annual interest: ");
		double interest = keyboard.nextDouble();
		DepositWithdrawl firstMonth = new DepositWithdrawl(balance, interest,
			 deposit1, withdrawl1);

		firstMonth.deposits();
		firstMonth.withdrawals();
		System.out.println(firstMonth.displayBalance());


		System.out.println("\n Let's start with a yearly input of your savings account " + 
				 "for last year: "); 
		SavingsAccount firstYear = new SavingsAccount(balance, interest);

		for (int i = 1; i <= 12; i++)
		{
			System.out.println("How much did you deposit on month " + i + ": ");
			firstYear.setDeposit(keyboard.nextDouble());

			System.out.println("How much did you withdrawl on month " + i + ": ");
			firstYear.setWithdrawl(keyboard.nextDouble());

			firstYear.setInterest();
		}

		System.out.println(firstYear.toString());

	}
}
