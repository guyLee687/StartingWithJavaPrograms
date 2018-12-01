import java.text.DecimalFormat;
//Jeffrey Wang 
//11.26.18

/**10.5 Course Grades: In a course, a teacher gives the following tests and assignments: 
- A lab activity that observed by the teacher and assigned a numeric score. 
- A pass/fail exam that has 10 questions. The minimum passing score is 70. 
- An essay that is assigned a numeric score. 
- A final exam that has 50 questions. 

Write a class named CourseGrades. The class should have a GradedAcivity array named grades
as a field. The array should have four elements, one for each of the assignments previously
described. The class should have the following methods:

-setLab: 			This method should accept a GardedActivity object as its arguement.
					This object should already hold the student's score for the lab activity. 
					Element 0 of the grades field should reference this object.

-setPassFailExam:	This method should accept a PassFailExam object as its argument. This 
					object should already hold the student's score for the pass/fail exam. 
					Element 1 of the grades field should reference this object.

-setEssay: 			This method should accept an Essay object as its argument. This object
					should already hold the student's score for the essay. 
					Element 2 of the grades field should reference this object. 

-setFinalExam: 		This method should accept a FinalExam object as its arguement. This 
					object should already hold the student's score for the final exam. 
					Element 3 of the grades field should reference this object. 

-toSTring: 			This method should return a string that contains the numeric scores and
					grades for each element in grades array. 

Demonstrate the class in a program
*/


public class CourseGrades implements Analyzable
{
	private GradedActivity[] transcript; 

	public CourseGrades()
	{
		transcript = new GradedActivity[4];
	}

	public CourseGrades(GradedActivity lab, PassFailExam exam,
							Essay essay, FinalExam finalExam)
	{
		transcript = new GradedActivity[]{lab, exam, essay, finalExam};
	}

	public void setLab(GradedActivity lab)
	{
		transcript[0] = lab;
	}

	public void setPassFailExam(PassFailExam exam)
	{
		transcript[1] = exam;
	}
	public void setEssay(Essay essay)
	{
		transcript[2] = essay;
	}

	public void setFinalExam(FinalExam finalExam)
	{
		transcript[3] = finalExam;
	}

	public double getAverage()
	{
		double total = 0;
		for(GradedActivity score : transcript)
			total += score.getScore();

		return (total/transcript.length);
	}

	public GradedActivity getLowest()
	{
		GradedActivity lowests = transcript[0];
		for (GradedActivity score : transcript)
		{
			if (score.getScore() < lowests.getScore())
			lowests = score;
		}

		return lowests;
	}

	public GradedActivity getHighest()
	{
		GradedActivity highests = transcript[0];
		for (GradedActivity score : transcript)
		{
			if (score.getScore() > highests.getScore())
			highests = score;
		}

		return highests;
	}

	public String toString()
	{
		DecimalFormat formatter = new DecimalFormat("#0.00");
		return "Transcript: \n -------------------- \n" + 
			   "Lab: " + transcript[0].getScore() + 
			    "\nPassFailExam: " + transcript[1].getScore() + 
	 			"\nEssay: " + formatter.format(transcript[2].getScore()) + 
			 	"\nFinal Exam: " + transcript[3].getScore(); 
	
	}
}