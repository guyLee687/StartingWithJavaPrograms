import java.util.Scanner;
import java.io.*;

//Jeffrey Wang
//11.15.18

/**
6.11 Deposit and Withdrawal Files:
Use Notepad or another text editor to create a text file "Deposits.txt"
Should contain:

100.00
124.00
78.92
37.55

Next create a text file named Withdrawals.txt 
Should contain: 

29.88
110.00
27.52
50.00
12.90

The #s in "Deposits.txt" file are the amounts of deposits that were
made during the month, and the numbers in the "Withdrawals.txt" file are the amounts of withdrawls that weree made during the month. 
Write a program that creates an instance of the SavingsAccount class that you wrote in Programming Challenge 10. The starting balance 
for the object is 500.00. The program should read the values from the Deposits.txt file and use the object's nethod to add them to the 
account balance. The program should read the values from the Withdrawals.txt file and use the object's method to subtract them from the 
account balance. The program should call the class method to calculate the monthly interest, and then display the ending balance and the total 
interest earned.
*/

public class DepositWithdrawl 
{
	File deposit;
	File withdrawals;
	SavingsAccount account;

	public DepositWithdrawl(double balance, double interest, File d, File w) throws IOException
	{
		account = new SavingsAccount(balance, interest);
		deposit = d;
		withdrawals = w;
	}

	public void deposits() throws IOException
	{
		Scanner inputfile = new Scanner(deposit);
		while (inputfile.hasNext())
			account.setDeposit(inputfile.nextDouble());
		inputfile.close();
	}

	public void withdrawals() throws IOException
	{
		Scanner inputfile = new Scanner(withdrawals);
		while (inputfile.hasNext())
			account.setWithdrawl(inputfile.nextDouble());
		inputfile.close();
	}

	public String displayBalance()
	{
		account.setInterest();
		return account.toString();
	}
}
