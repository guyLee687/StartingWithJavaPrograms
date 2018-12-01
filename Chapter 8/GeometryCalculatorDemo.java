import javax.swing.JOptionPane;
//Jeffrey Wang 
//11.17.18

/** 8.9-1 GeometryCalculaotr: Write a program o test the class, which displays 
"Geometry Calculator:
1. Calculate the Area of a ....
2. ...
3. ...
4. Quit"
*/

public class GeometryCalculatorDemo
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "You have started the GeometryCalculator!!!");
		int choice = -1;
		while(choice < 0 || choice > 4)
		{
			choice = Integer.parseInt(JOptionPane.showInputDialog("GeometryCalculator" + "\n1. Calculate the Area of a Circle." + 
												"\n2. Calculate the Area of a Rectangle." + 
												"\n3.Calculate the Area of a Triangle." + "\n4. Quit"));
			if(choice < 0 || choice > 4)
				JOptionPane.showMessageDialog(null, "Invalid Choice!");
		}

		switch (choice)
		{
			case 1:
				double r = Double.parseDouble(JOptionPane.showInputDialog("What is the radius?"));
				JOptionPane.showMessageDialog(null, "The area of the circle is: " + GeometryCalculator.areaCircle(r));
				break;
			case 2:
				double w = Double.parseDouble(JOptionPane.showInputDialog("What is the width?"));
				double l = Double.parseDouble(JOptionPane.showInputDialog("What is the length?"));
				JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + GeometryCalculator.areaRectangle(w, l));	
				break;
			case 3:
				double b = Double.parseDouble(JOptionPane.showInputDialog("What is the base?"));
				double h = Double.parseDouble(JOptionPane.showInputDialog("What is the height?"));
				JOptionPane.showMessageDialog(null, "The area of the triangle is: " + GeometryCalculator.areaTriangle(b, h));
				break;		
		}

		JOptionPane.showMessageDialog(null, "Exiting...");
		System.exit(0);
	}
}