import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;

//Jeffrey Wang 
//11.29.18	

/**11.7 File Encryption Filter: Write a program that adds 10 to the characterr cod of each 
character before it is written in the second file.*/

public class FileEncryption implements Serializable
{
	private File fileName;
	private String key = "@";
	
	public FileEncryption(String name) 
	{
		fileName = new File(name);
	}

	public String Encrypt()
	{
		try 
		{
			String name = "Encryption.dat";
			FileOutputStream fstream = new FileOutputStream(name);
			DataOutputStream outputFile = new DataOutputStream(fstream);

			outputFile.writeUTF("@");
			Scanner inputFile = new Scanner(fileName);

			while(inputFile.hasNext())
			{
				try
				{
					String newLine = inputFile.nextLine();
					for (int i = 0; i < newLine.length(); i++)
					{
						outputFile.writeChar(newLine.charAt(i));
						outputFile.writeChar('1');
						outputFile.writeChar('0');
					}
					outputFile.writeChar('\n');
				}
				catch(IOException e)
				{
					System.out.println("Data Error...skipped");
				}
			}

			outputFile.close();
			inputFile.close();
			return name;
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "File is not found.");
			System.exit(0);
			return null;
		}
	}
}