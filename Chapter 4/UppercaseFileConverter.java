import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

//Jeffrey Wang
//11.12.18

/**
4.15: Uppercase File Converter:
Write a program that asks the user for the names of two files. The first file should be opened for reading and the 
second file should be opened for writing. The program
should read the content from the first file and copy into the second stored as an uppercase version
*/

public class UppercaseFileConverter
{
	public static void main(String[] args) throws IOException
	{
		JOptionPane.showMessageDialog(null, "This program will copy " + 
				"the content of a file to another file as Uppercase.");
		String file1 = JOptionPane.showInputDialog("Type in a valid path of " + 
				"the file you want copied over: ");
		
		File outputFile = new File(file1);

		while (!outputFile.exists())
		{
			JOptionPane.showMessageDialog(null, "File does not exist.");
			System.exit(0);
		}

		Scanner fileReader = new Scanner(outputFile);

		String file2 = JOptionPane.showInputDialog("Type the name of the file " + 
						"that you want to copy over: ");

		FileWriter fwriter = new FileWriter(file2, true);
		PrintWriter inputFile = new PrintWriter(fwriter);

		while (fileReader.hasNext())
		{
			inputFile.println(fileReader.nextLine().toUpperCase());
		}

		inputFile.close();
		fileReader.close();

		JOptionPane.showMessageDialog(null, "Your file has been converted " + 
					"uppercase.");
		System.exit(0);
	}
}