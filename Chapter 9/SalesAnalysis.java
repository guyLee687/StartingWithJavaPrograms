import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

//Jeffrey Wang
//11.20.18

/**9.11 Sales Analysis: The file SalesData.txt, in this chapter's source code folder, 
contains the dollar amount of sales that a retail store made each day for a number of 
weeks. Each line in the file contains seven numbers, which are the sales numbers
for one week. The numbers are separated by a comma. The following line
is an example from the file:

Write a program that opens the file and processes its contents. The program should display:

- The total sales for each week
- The average daily sales for each week,
- The total sales for all of the weeks,
- The average weekly sales. 
- The week number that had the highest amount of sales. 
- The week number that had the lowest amount of sales.
*/

public class SalesAnalysis
{
	public static void main(String[] args) throws IOException
	{
		String tokens = "";
		File file = new File("SalesData.txt");
		Scanner inputFile = new Scanner(file);

		while (inputFile.hasNext())
			tokens = inputFile.nextLine();

		inputFile.close();
		
		String[] splitTokens = tokens.split(",");

		System.out.println("Total Sales Per Week: " + 
			(totalSalesPer(new StringTokenizer(tokens, ","))));


		System.out.println("Average Sales Per Week: " + 
			(avgSalesPer(new StringTokenizer(tokens, ","), 7)));

		System.out.println("Total Sales generated within " + splitTokens.length + 
			": " + (totalSales(new StringTokenizer(tokens, ","))));	

		System.out.println("Average Sales generated within " + splitTokens.length + 
			": " + (totalSales(new StringTokenizer(tokens, ",")))/7);

		System.out.println("The week with the highest Sales is: week " + 
			highestSales(splitTokens));

		System.out.println("The week with the lowest Sales is: week " + 
			lowestSales(splitTokens));		

	}

	public static String totalSalesPer(StringTokenizer strTokens)
	{
		int i = 1;
		String totalSalesPerWk = ""; 
		while(strTokens.hasMoreTokens())
		{
			totalSalesPerWk = totalSalesPerWk.concat("\n Week " + i +" : " + 
				strTokens.nextToken());
			i++;
		}
		return totalSalesPerWk;
	}

	public static String avgSalesPer(StringTokenizer strTokens, int days)
	{
		int i = 1;
		String avgSalesPerWk = ""; 
		while(strTokens.hasMoreTokens())
		{
			double avg = (Double.parseDouble(strTokens.nextToken()))/days;
			avgSalesPerWk = avgSalesPerWk.concat("\n Week " + i + " : " + 
				avg);
			i++;
		}
		return avgSalesPerWk;
	}

	public static double totalSales(StringTokenizer strTokens)
	{
		double total = 0; 
		while (strTokens.hasMoreTokens())
			total += Double.parseDouble(strTokens.nextToken());
		return total;
	}

	public static int highestSales(String[] sales)
	{
		int highest = 0;
		for (int i = 0; i < sales.length; i++)
		{
			if (Double.parseDouble(sales[i]) > Double.parseDouble(sales[highest]))
				highest = i;
			}
			return highest + 1;
		}

		public static int lowestSales(String[] sales)
		{
			int lowest = 0;
			for (int i = 0; i < sales.length; i++)
			{
				if (Double.parseDouble(sales[i]) < Double.parseDouble(sales[lowest]))
					lowest = i;
				}
				return lowest + 1;
			}
		}