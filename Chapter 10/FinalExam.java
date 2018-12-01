
//Jeffrey Wang 
//11.26.18

/**10.0.2 FinalExam: This class determines the grade 
for final exam. 
*/ 

public class FinalExam extends GradedActivity
{
	private int numQuestions; 	//Number of Questions
	private double pointsEach; 	//Points for each question
	private int numMissed;		//Questions missed

	/**
	The constructor sets the number of questions on the exam
	and the number of questions missed. 
	@param questions The number of questions. 
	@param missed The number of questions missed. 
	*/

	public FinalExam(int questions, int missed)	
	{
		double numericScore;	//To hold a numeric score

		// Set the numQuestions and numMissed fields.
		numQuestions = questions;
		numMissed = missed; 

		// Calculate the points for each question and 
		// the numeric score for this exam.
		pointsEach = 100/questions;
		numericScore = 100 - (missed * pointsEach);

		// Call the inherited setScore method to 
		// set the numeric score
		setScore(numericScore);
	}

	/** The getPointEach method returns the number of points 
	is worth. 
	@return The value in the pointsEach field. 
	*/

	public double getPointEach()
	{
		return pointsEach;
	}

	/**
		the getNumMissed method returns the number of 
		questions missed.
		@return The value in the numMissed field. 
	*/

	public int getNumMissed()
	{
		return numMissed;
	}
}