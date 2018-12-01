
//Jeffrey Wang
//11.27.18

/**10.5.1 CourseGrades Demo*/

public class CourseGradesDemo
{
	public static void main(String[] args) 
	{
		GradedActivity lab = new GradedActivity();
		lab.setScore(80.0);

		PassFailExam exam = new PassFailExam(20, 5, 60.0);
		Essay essay = new Essay (.80, .95, .70, .65);
		FinalExam finalExam = new FinalExam (20,2);

		System.out.println(essay);

		CourseGrades reportCard = new CourseGrades(lab, exam, essay, finalExam);

		System.out.println();
		System.out.println(reportCard);

		System.out.println("Average Score: " + reportCard.getAverage());
		System.out.println("Highest Score: " + isActivity(reportCard.getHighest())
									+ " " + reportCard.getHighest().getScore());
		System.out.println("Lowest Score: " + isActivity(reportCard.getLowest())
									+ " " + reportCard.getLowest().getScore());
	}

	public static String isActivity(GradedActivity s)
	{
		if (s instanceof PassFailExam)
			return "PassFailExam";
		else if (s instanceof Essay)
			return "Essay";
		else if (s instanceof FinalExam)
			return "Final Exam";
		else 
			return "lab";
	}
}