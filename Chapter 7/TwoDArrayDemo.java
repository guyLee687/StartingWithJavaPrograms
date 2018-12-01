import java.util.Scanner;
//Jeffrey Wang
//11.16.18

/**7.15-1 TwoDArrayDemo: Should test out TwoDArray.class*/

public class TwoDArrayDemo
{
	public static void main(String[] args) 
	{
		System.out.println("This is the program that demostrates methods " + 
			"for a 2D array.");	
		System.out.println("Creating an array...");

		double[][] array;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("\n How many rows are there in the array:  ");
		array = new double[keyboard.nextInt()][];

		for (int i = 0; i < array.length; i++)
		{
			System.out.print("\nHow much columns are in row  " + i);
			array[i] = new double[keyboard.nextInt()];
		}

		System.out.println("--------------------------------------");
		for (int i = 0; i < array.length ; i++)
		{
			for (int k = 0; k < array[i].length; k++)
			{
				System.out.print("\nWhat is in row " + i + " and column " + k);
				array[i][k] = keyboard.nextDouble();
			}
		}

		System.out.println("\n------------------------------------------");
		System.out.println("Array: " + array.toString());

		TwoDArray tda = new TwoDArray(array);
		System.out.println("\n total: " + tda.getTotal());
		System.out.println("Average: " + tda.getAverage());
		System.out.println("Row(1) total " + tda.getRowTotal(1));
		System.out.println("Column(3) total: " + tda.getColumnTotal(3));
		System.out.println("HighestInRow(1) total: " + tda.getHighestInRow(1));
		System.out.println("LowestInRow(1) total: " + tda.getLowestInRow(1));
	}
}