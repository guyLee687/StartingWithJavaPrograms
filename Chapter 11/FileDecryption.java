import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

//Jeffrey Wang
//11.29.18

/**11.8 File Decryption Filter: Write a program that decrypts the file produced by the 
program from 11.7 "File Encryption," restore the data to its original state, and write
it to another file*/

public class FileDecryption implements Serializable
{
	private File fileName;

	public FileDecryption(String name)
	{
		fileName = new File(name);
	}

	public String Decrypt(String name)
	{
		try 
		{

			String oldFile = fileName.getName();

			FileInputStream fstream = new FileInputStream(oldFile);
			DataInputStream inputFile = new DataInputStream(fstream);

			ArrayList<Character> characters = new ArrayList<>();
			boolean flag = true;
			inputFile.readUTF();				
			while (flag)
			{
				try 
				{
					characters.add(inputFile.readChar());
				}
				catch(EOFException e)
				{
					flag = false;
				}
			}

			StringBuilder output = new StringBuilder();
			for (char s: characters)
				output.append(s);

			String output1 = new String(output);
			System.out.println(output1);
			String[] tokens = output1.split("10");

			PrintWriter outputFile = new PrintWriter(name);
			for(String s: tokens)
				outputFile.print(s);

			outputFile.close();
			inputFile.close();

			return "Done...";
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "File is not found.");
			System.exit(0);
			return "Empty";
		}
	}

}
