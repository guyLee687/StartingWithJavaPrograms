
//Jeffrey Wang 
//11.17.18

/** 8.? Using Enumerated Types and finalized method
- Types should be Best Songs using (ordinals(), equals(), compareTo(), and switch())
- finalize ()  println(link to despacito)
*/

public class BestSongs
{
	
	private Songs song = Songs.despacito;

	public BestSongs(Songs song)
	{
		this.song = song;
	}

	public void playSong()
	{
		System.out.println("Alexa play " + song + ".");
	}

	public void setSong(Songs song)
	{
		this.song = song;
	}

	public Songs getSong()
	{
		return song;
	}

	// If int < 0 Song song is inferior to this song. JK XD
	public int compareTo(Songs song)
	{
		return this.song.ordinal() - song.ordinal();
	} 

	public void finalize() throws Throwable
	{
		System.out.println(song.despacito + " is the greatest!!!");
	}
}