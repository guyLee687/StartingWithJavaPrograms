import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;

//Jeffrey Wang
//11.16.18

/**7.12 Name Search: Write a program to read the content of two files "GirlNames.txt"
and "BoyNames.txt" into two separate ArrayLists. Sort them. The user should be able to enter a boy's name,
a girl's name, or both, and the application will display messages indicating whether the names are among the most popular.
*/

public class NameSearch
{
	public static void main(String[] args) throws IOException
	{
		ArrayList<String> boyNames = new ArrayList<>();
		ArrayList<String> girlNames = new ArrayList<>();

		File file1 = new File("BoyNames.txt");
		File file2 = new File("GirlNames.txt");	

		Scanner inputfile1 = new Scanner(file1);
		Scanner inputfile2 = new Scanner(file2);

		while (inputfile1.hasNext())
			boyNames.add(inputfile1.nextLine());
		boyNames = sort(boyNames);

		while (inputfile2.hasNext())
			girlNames.add(inputfile2.nextLine());
		girlNames = sort(girlNames);

		inputfile2.close();
		inputfile1.close();

		JOptionPane.showMessageDialog(null, "You have just opened a program for a name search: ");
		String boyGirl = JOptionPane.showInputDialog("Is the name a boy name or girl name? <boy/girl>");
		String name; 

		if (boyGirl.equals("girl"))
		{
			name = JOptionPane.showInputDialog("What name do you want to search? ");
			if(binarySearch(girlNames, name))
				JOptionPane.showMessageDialog(null, "Your name is one of the top 200 names for girls!");
			else
				JOptionPane.showMessageDialog(null, "Your name is not within the top 200 names for girls.");
		}
		else 
		{
			name = JOptionPane.showInputDialog("What name do you want to search? ");
			if(binarySearch(boyNames, name))
				JOptionPane.showMessageDialog(null, "Your name is one of the top 200 names for boys!");
			else
				JOptionPane.showMessageDialog(null, "Your name is not within the top 200 names for boys.");
		}
		System.exit(0);
	}

	public static ArrayList<String> sort(ArrayList<String> list)
	{
		for (int i = 0; i < list.size(); i++)
		{	
			int minIndex = i;
			String minValue = list.get(i);
			for (int k = i+1; k < list.size(); k++)
			{
				if (list.get(k).compareTo(minValue) < 0)
				{
					minIndex = k;
					minValue = list.get(k);
				}

			}
			list.set(minIndex, list.get(i));
			list.set(i,minValue);
		}
		return list;
	}

	public static boolean binarySearch(ArrayList<String> list, String word)
	{
		int beginning = 0;
		int end = list.size() - 1;
		int middle = (end + beginning)/2;
		boolean flag = false;
		int sentinel = -1;
		String wordss = word.toLowerCase();
		while(sentinel == -1 && beginning <= end)
		{
			String comparing = list.get(middle).toLowerCase();

			if (comparing.equals(wordss))
			{
				flag = true;
				sentinel = 1;
			}
			else if ((wordss.compareTo(comparing)) > 0)
			{
				beginning = middle + 1;
				middle =  (end + beginning)/2;
			} 
			else
			{
				end = middle - 1;
				middle =  (end + beginning)/2;
			} 
		}

		return flag;
	}
}

