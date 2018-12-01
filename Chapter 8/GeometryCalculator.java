import java.lang.Math;
//Jeffrey Wang 
//11.17.18

/** 8.9 Geometry Calculator: Design a Geometry class with the following methods
- A static method that accepts a radius of a circle and returns the area of the circle.
- A static method that accepts the length and width of a rectangle and returns the area
of the rectangle.
- A static method that accepts the length of a triangle's base and the triangle's height. and Returns the area of the triangle.

All of them should display an error message if negative values are used for all the parameters in each method. 

Write a program o test the class, which displays 
"Geometry Calculator
1. Calculate the Area of a ....
2. ...
3. ...
4. Quit

Enter your choice (1-4) "

Display Error if it falls outside the range.
*/

public class GeometryCalculator
{
	public static double areaCircle(double radius)
	{
		return Math.PI*Math.pow(radius,2);
	}

	public static double areaRectangle(double width, double length)
	{
		return length * width;
	}

	public static double areaTriangle(double base, double height)
	{
		return .5 * base * height;
	}
}