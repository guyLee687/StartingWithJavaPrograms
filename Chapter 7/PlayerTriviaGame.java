import java.util.ArrayList;
import javax.swing.JOptionPane;

//Jeffrey Wang
//11.16.18

/**7.17-2 PlayerTriviaGame: Creates a profile of each player for the trivia Game*/

public class PlayerTriviaGame
{
	private int totalPoints;
	private int choice = -1;
	private ArrayList<Integer> correctAnswers = new ArrayList<>();
	private ArrayList<TriviaGame> questions = new ArrayList<>(10);
	public PlayerTriviaGame()
	{
		totalPoints = 0;
	}

	public void createQuestion(int selection)
	{	
		TriviaGame game = new TriviaGame(selection);
		questions.add(game);
	}

	public TriviaGame getQuestion(int selection)
	{
		return questions.get(selection);
	}

	public void isCorrect (TriviaGame question, int choice, int number)
	{
		if (question.getCorrectAnswer() == choice)
		{
			JOptionPane.showMessageDialog(null, "You got question " + question.getQuestionNumber() + " correct!");
			totalPoints++;
			correctAnswers.add(question.getQuestionNumber());
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You got question " + question.getQuestionNumber() + " wrong..." + 
						"\n The correct answer is: " + question.getCorrectAnswer());
		}

	}

	public String displayPoints()
	{
		String allCorrect = ""; 
		for (int value: correctAnswers)
			allCorrect = allCorrect + ", " + value;
		return "You got questions ("  + allCorrect + ") correct." + (correctAnswers.size()*500) 
			+ " pts.";
	}

	public int getPoints()
	{
		return correctAnswers.size();
	}

}