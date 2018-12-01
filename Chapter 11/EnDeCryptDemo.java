import java.util.Scanner;
import java.io.*;

//Jeffrey Wang
//11.29.18

/**11.~ Practicing File Encryption/Decryption: This program will demonstrate file decryption 
and encryption.*/

public class EnDeCryptDemo 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What file do you want to Encrypt?");
		String oldFileName = keyboard.nextLine();

		FileEncryption oldFile = new FileEncryption(oldFileName);
		String codedFile = oldFile.Encrypt(); 
		if (codedFile == null)
			System.exit(0);

		System.out.println("Creating Decrypted Copy of file:");

		FileDecryption newFile = new FileDecryption(codedFile);
		System.out.println(newFile.Decrypt("CopyFile.txt"));

		FileOutputStream fstream = new FileOutputStream("hello.dat");
			DataOutputStream outputFile = new DataOutputStream(fstream);
			outputFile.writeChar('C');
			outputFile.close();


	}
}