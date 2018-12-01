import java.util.Scanner;
//Jeffrey Wang 
//11.08.18

/**
3.16 Book Club Points: Serendipity Booksellers have a book 
club that awards points to its customers based on the number 
 books purchased each month. The points are awarded as 
 follows: 
- 0 books, earns 0 pts
- 1 book, earn 5 pts
- 2 books, earns 15 pts
- 3 books, earns 30 pts
- 4 books+, earns 60 pts. 

Write a program that asks the user to enter the number 
of books that he or she has purchased this month, and 
display the number of points awarded. 
*/

public class BookClubPoints
{
	public static void main(String[] args)
	{
		Scanner keyboard =  new Scanner(System.in);
		
		boolean flag;
		int books;
		
		do
		{
			System.out.print(" Write the a positive number of books you have purchased " + 
			 		"within this month: ");
			books = keyboard.nextInt();
			flag = books >= 0 ? true: false; 
		}while(!flag);

		switch (books) 
		{
			case 0: 
			{
				System.out.println("\n The number of points " + 
					"you have recieved is: 0 pts");
			}
			case 1:
			{
				System.out.println("\n The number of points " + 
					"you have recieved is: 5 pts");
			}
			case 2: 
			{
				System.out.println("\n The number of points " + 
					"you have recieved is: 10 pts");
			}
			case 3: 
			{
				System.out.println("\n The number of points " + 
					"you have recieved is: 30 pts");
			}
			default: 
			{
				System.out.println("\n The number of points " + 
					"you have recieved is: 60 pts");				
			}
		}

	}
}