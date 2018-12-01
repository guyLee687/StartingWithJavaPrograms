
//Jeffrey Wang
//11.20.18

/**9.12-1 Miscellaneous String Operation Demo: We will demonstrate the 
MiscellString class
*/

public class MiscellStringDemo
{
	public static void main(String[] args) 
	{
		String str1 = "I love to eat a Peter Picked of Pickle Peppers.";
		String str2 = " love";
		String str3 = ", with zealous passion, would hate";

		System.out.println("Here is the first string: \n " + str1);
		System.out.println("Here is the second string: \n" + str2);
		System.out.println("Here is the third string: \n" + str3);

		System.out.println("Here is the wordCount of string 1:\n " + 
			MiscellString.wordCount(str1));
		System.out.println("Here is the most frequent character in string 1:\n " + 
			MiscellString.mostFrequent(str1));
		System.out.println("\n We will replace the first string with the third string " + 
			"where there is a reoccurence with the second string: \n" );
		MiscellString.replaceSubString(str1, str2, str3);


		char[] characters = {'H','e','l','l','o',' ','W','o','r','l','d'};
		System.out.println("\n We are coverting a character array to a string:");
		System.out.println(MiscellString.arrayToString(characters));
	}
}
