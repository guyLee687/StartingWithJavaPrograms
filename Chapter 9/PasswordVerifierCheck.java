import javax.swing.JOptionPane;
import java.io.*;

//Jeffrey Wang 
//11.20.18

/**9.5-1: PasswordVerifierCheck: Demostrates Password Verifer*/

public class PasswordVerifierCheck
{
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Create an Account:");
		char input = (JOptionPane.showInputDialog("Would you like to create an " + 
						"account? <Y/N>")).charAt(0);
		input = Character.toUpperCase(input);
		if (input == 'N')
			System.exit(0);

		String user = JOptionPane.showInputDialog("UserName: ");
		String password = JOptionPane.showInputDialog("Password: ");

		while (!(PasswordVerifier.isPassword(password)))
		{
			StringBuilder errors = new StringBuilder("Password is ");
			if (password.length() < 6)
				errors.append(" less than 6 characters");
			if(!(PasswordVerifier.noDigit(password)))
				errors.append(" missing a digit");
			if(!(PasswordVerifier.noUpperLower(password)))
				errors.append( " missing a Upper or Lower Letter");
			password = JOptionPane.showInputDialog(errors + "\n Password: ");
		}

		PasswordVerifier account = new PasswordVerifier(user,password);
		JOptionPane.showMessageDialog(null, "Account \nUser: " + account.getUser() + 
				"\nPassword: " + account.getPassword());

		System.exit(0);
	}
}