
//Jeffrey Wang
//11.15.18

/** 6.10 SavingsAccount
Design a Savings Account class that stores a saving account's annual interest rate 
and balance. Should have the savings starting account balance (constructor).
methods -- Adding deposits, Subtracting Withdrawal, adding the amount of montly interest
		-- And displaying total balance, total interest gained, withdrawals made and deposits made.
*/

public class SavingsAccount
{
	private double balance, interest, 
				withdrawals, deposits;
	private double totalInterest = 0, totalWithdrawals = 0, 
					totalDeposits = 0;

	public SavingsAccount()
	{
		balance = 0;
		interest = .001/12;
	}

	public SavingsAccount(double startingBal)
	{
		balance = startingBal;
		interest = .001/12;
	}

	public SavingsAccount(double startingBal, double i)
	{
		balance = startingBal;
		interest = i/12;
	}

	public void setDeposit(double d)
	{
		deposits = d; 
		balance += d;
		totalDeposits += d;
	}

	public double getDeposit()
	{
		return deposits;
	}

	public void setInterest()
	{
		totalInterest = (interest)*(balance);
	}
	
	public void setInterest(double i)
	{
		interest = i;
		totalInterest = (interest)*(balance);
	}

	public void setWithdrawl(double w)
	{
		withdrawals = w;
		balance -= w;
		totalWithdrawals += w;
	}

	public double getWithdrawl()
	{
		return withdrawals;
	}

	public double getBalance()
	{
		return balance;
	}

	public String toString()
	{
		return "Your ending budget is: " + balance + "\n Your total amount of deposits is: " 
		+ totalDeposits + "\n Your total amount of withdrawals is: " + totalWithdrawals + 
		"\n Your total interest accumulated is: " + totalInterest;
	}
}