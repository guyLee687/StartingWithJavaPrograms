import java.util.Scanner;

//Jeffrey Wang
//11.16.18

/**7.15: 2D Array: Write a program that creates a two-dimensional array initialized with test data. 
Use any primitive type that you wish. The program should have the following methods. 
-getTotal()
-getAverage()
-getRowTotal()
-getColumnTotal()
-getHighestInRow()
-getLowestInRow()
*/

public class TwoDArray
{
	private double[][] tda; //Two Dimension Arrays

	public TwoDArray()
	{
		tda = new double[0][0];
	}

	public TwoDArray(double[][] tda)
	{
		this.tda = tda;
	}

	public double getTotal()
	{
		double total = 0;
		for (int i = 0; i < tda.length; i++)
			for(double value : tda[i])
				total += value;
		return total;
	}

	public double getAverage()
	{
		int rowCol = 0;
		for(int i = 0; i < tda.length; i++)
			rowCol += tda[i].length;
		return getTotal()/rowCol;
	}

	public double getRowTotal(int row)
	{
		double total = 0;
		for (double value: tda[row])
			total += value;
		return total;
	}

	public double getColumnTotal(int col)
	{
		double total = 0;
		for (int i = 0; i < tda.length; i++)
		{
			if (tda[i].length > col)
				total += tda[i][col];
		}
		return total;
	}

	public double getHighestInRow(int row)
	{
		double maxValue = tda[row][0];
		for (int i = 1; i < tda[row].length; i++)
			if (tda[row][i] > maxValue)
				maxValue = tda[row][i];
		return maxValue;
	}

	public double getLowestInRow(int row)
	{
		double minValue = tda[row][0];
		for (int i = 1; i < tda[row].length; i++)
			if (tda[row][i] < minValue)
				minValue = tda[row][i];
		return minValue;
	}
}