import java.util.ArrayList;
//Jeffrey Wang
//11.20.18

/**9.5 Password Verifier: Your software requires that users' password meet the following 
criteria: 
 - The password should be at least six characters long. 
 - The password should contain at least one uppercase and at least one lowercase letter.
 - The password should have at least one digit. 

 Write a class that a password meets the stated criteria. Demoonstrate the class in a program that allows the user to enter a password and then display a message indicating whether it is valid or not.
 */

 public class PasswordVerifier
 {
 	private String user = ""; 
 	private String password;
 	private static final int CHARACTERS = 6;
 	private static final int UNIQUE = 1;

 	public PasswordVerifier(String user, String password)
 	{	
 		this.user = user;
 		this.password = password;
 	}

 	public PasswordVerifier(String password)
 	{
 		this("", password);
 	}

 	public String getUser()
 	{
 		return user;
 	}

 	public String getPassword()
 	{
 		return password;
 	}

 	public static boolean isPassword(String password)
 	{
 		boolean okay = true;
 		if(password.length() < 6)
 			okay = false;
 		if(!noDigit(password))
 			okay = false;
 		if(!noUpperLower(password))
 			okay = false;
 		return okay;

 	}

 	public static boolean noDigit(String password)
 	{
 		for (int i = 0; i <= password.length() - 1; i++)
 		{
 			if (Character.isDigit(password.charAt(i)))
 				return true;
 		}
 		return false;
 	}

 	public static boolean noUpperLower(String password)
 	{
 		int upper = 0, lower = 0, i = 0;
 		while ((upper <= 0 || lower <=0) && (i < password.length()))
 		{
 			if (Character.isUpperCase(password.charAt(i)))
 				upper++;
 			if (Character.isLowerCase(password.charAt(i)))
 				lower++;
 			i++;
 		}

 		if ((upper > 0) && (lower > 0))
 			return true;
 		return false;
 	}

 }