
//Jeffrey Wang 
//11.26.18

/**10.4: Essay Class Design an Essay class that extends the
 Graded Acctivity class presented in this chapter. 
 The Essay class should determine the grade a student recieves for an essay. 
 The student's essay score can be up to 100 and is determined in the following manner:

Grammar: 30 pts
Spelling: 20 pts
Correct length: 20pts
Content: 30 pts

Demonstrate the class in a simple program
*/

public class Essay extends GradedActivity
{
	private final int GRAMMAR = 30;
	private final int SPELLING = 20;
	private final int LENGTH = 20;
	private final int CONTENT = 30;

	private double grammar;
	private double spelling;
	private double length;
	private double content;

	public Essay(double grammar, double spelling, 
						double length, double content)
	{
		this.grammar = grammar;
		this.spelling = spelling;
		this.length = length;
		this.content = content;

		double points = (grammar * GRAMMAR) + (spelling * SPELLING) + 
						(length * LENGTH) + (content * CONTENT);
		setScore(points);
	}

	public double getGrammar()
	{
		return grammar;
	}

	public double getSpelling()
	{
		return spelling;
	}

	public double getLength()
	{
		return length;
	}

	public double getContent()
	{
		return content;
	}

	public String toString()
	{
		return "Essay Points: \n -------------  \n " + 
					"Grammar: " + getGrammar() + 
					"\nSpelling: " + getSpelling() + 
					"\nLength: " + getLength() + 
					"\nContent: " + getContent() +
					"\nTotal: " + getScore(); 
	}
}

	
