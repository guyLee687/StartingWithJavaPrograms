
//Jeffrey Wang 
//11.26.18

/**10.6 Analyzable Interface: Modify the CourseGrades class you created in Programming 
Challenge 5 so it implements the following interface: 

The getAverage method should return the average of the numeric scores stored in grades
array. The getHighest method should return a reference to the element of the grades array 
that has the highest numeric score. The getLowest method should return a reference to the element to the element of the grades array that  has the lowest numeric score. 
Demostrate the new methods in a complete program.
*/

public interface Analyzable
{
	double getAverage();
	GradedActivity getHighest();
	GradedActivity getLowest();
}