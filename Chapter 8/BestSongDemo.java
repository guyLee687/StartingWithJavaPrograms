import java.util.Scanner;
//Jeffrey Wang 
//11.17.18

/**8.?-1 BestSongDemo: Despacito is the greatest*/

public class BestSongDemo
{
	public static void main(String[] args)
	{
		Songs song = Songs.baby;

		BestSongs bestS = new BestSongs(song);
		bestS.playSong();
	

		if (bestS.compareTo(Songs.despacito) < 0)
			System.out.println("The song " + bestS.getSong() + " is inferior to " + Songs.despacito);
		else
			System.out.println("This song is okay.");

		switch (song)
		{
			case despacito: 
				System.out.println("This song is good");
				break;
			case callMeMaybe:
				System.out.println("Not this again");
				break;
			case baby: 
				System.out.println("This song is trash!!");
				break;
			default:
				System.out.println("I don't know what this is");
				break;
		}

		song = null; 
		System.out.println("Thank God we aren't playing that anymore.");

		Scanner keyboard = new Scanner(System.in);
		String waitingForGarbageCollector = keyboard.nextLine();
	}
}