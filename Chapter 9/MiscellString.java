import java.util.StringTokenizer;
//Jeffrey Wang
//11.20.18

/**9.12: Miscellaneous String Operations: Write a class with the following static methods:
- wordCount: The method shouold accept a reference to a String object as an argument
and return  the number of words contained in the object.
- arrayToString: This method accepts a char array as an arguement and converts it to a 
String object. The method should return a reference to a String object.
-mostFrequent: This method accepts a reference to a String object as an argument and 
returns the character that occurs the most frequently in the object.
-replaceSubstring: This method accepts three references to String objects as arguments. 
tr1,2 &3 It searches str 1 and for all occurences of str 2, it replaces it with str 3.

Demonstrate each in a program.
*/

public class MiscellString
{
	public static int wordCount(String str)
	{
		StringTokenizer tokens = new StringTokenizer(str);
		return tokens.countTokens();
	}

	public static String arrayToString(char[] charcters)
	{
		return String.valueOf(charcters); 
	}

	public static char mostFrequent(String str)
	{
		char[] characters = str.toCharArray();

		char popular = ' ';
		int popularCount = 0;
		for (int i = 0; i < characters.length; i++)
		{
			int count = 0;
			if (!(characters[i] == ' ') && !(characters[i] == popular))
			{
				for (int k = i + 1; k < characters.length; k++)
				{
					if (characters[k] == characters[i] )
						count++;
				}
			}
			if (count > popularCount)
			{
				popular = characters[i];
				popularCount = count;
			}
		}
		return popular;
	}

	public static void replaceSubString(String...str)
	{
		int position = str[0].indexOf(str[1]);
		StringBuilder string = new StringBuilder(str[0]);
		string.replace(position, position + str[1].length(), str[2]);
		str[0] = string.toString();
		System.out.println(str[0]);

	}
}