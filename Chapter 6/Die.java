import java.util.Random;

//Jeffrey Wang
//11.15.18

/** Die Class: 

*/

public class Die
{
	private int sides;
	private int value;

	public Die (int dieSided)
	{
		sides = dieSided;
		roll();
	}

	public void roll()
	{
		//Create a Random;
		Random rand = new Random();

		//Get a random value for the dice.
		value = rand.nextInt(sides) + 1;
	}

	/** 
		getSides method
		@return The number of sides for this die.
	*/

	public int getSides()
	{
		return sides;
	}

	/**
		getValue method
		@return The value of the die;
	*/
	public int getValue()
	{
		return value;
	}
}
