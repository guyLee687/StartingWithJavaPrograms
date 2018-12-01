import javax.swing.JOptionPane;
import java.text.DecimalFormat;

//Jeffrey Wang
//11/08/18

/**
3.6 Time Calculator: Write a program that asks the user to
enter a number of seconds.

- If the # of seconds entered by the user is >= 60, the program
should display # minutes in seconds.

- If the # of seconds entered by the user is >= 3,600, the program
should display # hours in seconds.
 
- If the # of seconds entered by the user is >= 86,400, the program
should display # days in seconds.
*/

public class TimeCalculator
{
	public static void main(String[] args)
	{
		
		String input= JOptionPane.showInputDialog("Enter a number " + 
											"of seconds for conversion: ");
		double seconds = Double.parseDouble(input);
		DecimalFormat formatter = new DecimalFormat("#,##0.00");

		if (seconds >= 86400)
			JOptionPane.showMessageDialog(null, "Your seconds have been converted " + 
								"in terms of " + "days: " + formatter.format(seconds/86400));
		else if (seconds >= 3600)
			JOptionPane.showMessageDialog(null, "Your seconds have been converted " + 
								"in terms of " + "hours: " + formatter.format(seconds/3600));
		else if (seconds >= 60)
			JOptionPane.showMessageDialog(null, "Your seconds have been converted " + 
								"in terms of " + "minutes: " + formatter.format(seconds/60));
		else 
			JOptionPane.showMessageDialog(null, "Your seconds could not be converted: " + 
								formatter.format(seconds));
		System.exit(0);

	}
}