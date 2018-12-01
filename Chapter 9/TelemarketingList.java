import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;


//Jeffrey Wang
//11.20.18

/** 9.6 Telemarketing Phone Number List: Write a program that has to parallel arrays of 
String objects. One of the arrays should hold people's names and the other should hold 
their phone numbers. Here are example contents of both arrays.

	name Array Example 				phone Array Example
	"Harrison Rose" 				"555-2234"
	...								...

The program should ask the user to enter a name or the first few characters of a name
to search for in the array. The rogram should display all of the names that match
the user's input and their corresponding phone numbers from the list.

Smith, William: 555-1785;
*/

public class TelemarketingList
{
	public static void main(String[] args) throws IOException
	{
	
		File nameFile = new File("PhoneBookNames.txt");
		File numberFile = new File("PhoneBookNumbers.txt");

		Scanner inputFile1 = new Scanner(nameFile).useDelimiter("@");
		Scanner inputFile2 = new Scanner(numberFile);

		String[] name = new String[100];
		int i = 0;
		while (inputFile1.hasNext())
		{
			name[i] = inputFile1.nextLine();
			i++;
		}
		inputFile1.close();

		String[] number = new String[100];
		int k = 0;
		while (inputFile2.hasNext())
		{
			String token = (inputFile2.nextLine());
			token = token.replace("(", "");
			token = token.replace(")", "-");
			number[k] = token;
			k++;
		}
		inputFile2.close();

		JOptionPane.showMessageDialog(null, "JEFFREY'S PHONEBOOK");
		String search = JOptionPane.showInputDialog("Type in a keyword and we will retrieve members " + 
						"out of a phone book: ");
		
		StringBuilder results = new StringBuilder();
		for (int j = 0; j < name.length; j++ )
		{
			if(name[j].indexOf(search) > -1)
			{
				int upper = 0;
				for(int l = 1; l < name[j].length(); l++)
				{
					if(Character.isUpperCase(name[j].charAt(l)))
						upper = l;

				}
				results.append("\n" + name[j].substring(upper) +
				", " + name[j].substring(0, upper) + "   " + number[j]);
			}
		}

		JOptionPane.showMessageDialog(null, "Person        Number" + 
			"\n---------------------------------" + results );

		System.exit(0);
	}
}