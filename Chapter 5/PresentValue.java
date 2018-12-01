import java.Lang.Math;
import java.util.Scanner;

//Jeffrey Wang
//11.14.18

/**5.16 Present Value: Suppose you want to deposit a certain amount of money
into a savings account, and then leave it alone to draw interest for the next
10 years. At the end of 10 years, you would like to have $10,000 in the account.
How much do you need to deposit today to make it happen

P = F / (1+ r)^n

- P is the present value, or the amount you need to deposit today. 
- F is the future value that you wnat in your account ($10,000).
- r is the annual interest rate.
- n is the number of years that you plane to let the money sit.

Write a method named presentValue that performs this calculation. 
*/

public class PresentValue
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This program will calculate how much you need to deposit \n" 
			+ "In a savings account to gain the desired amount.");

		System.out.print("\nEnter the amount you want to accumlate: ");
		double savings = keyboard.nextDouble();

		System.out.print("\nEnter the annual interest rate in decimal form: ");
		double rates = keyboard.nextDouble();

		System.out.println("\nEneter the amount of years you want your desire savings to accumulate: ");
		double years = keyboard.nextDouble();

		double principal = presentValue(savings, rates, years);
		System.out.printf("\n The necessary principal deposit needs to be $%,.2f");
	}

	/**
	This method returns the required principal amount for a savings account
	to accumulate a certain amount for a certain amount of years. 
	@param f: The desired amount accumulated
	@param r: The rate of annual interest\
	@param n: The number of years
	@return The required principal amount
	*/
	public static double presentValue(double f, double r, double n)
	{
		return (f/(Math.pow(1 + r, n)));
	}
}
	
