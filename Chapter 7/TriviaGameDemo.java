import javax.swing.JOptionPane;
import java.util.ArrayList;

//Jeffrey Wang
//11.16.18

// 7.17-1: Trivia Game Demo: This is a demo of the Trivia Game

public class TriviaGameDemo
{
	public static void main(String[] args) 
	{
		PlayerTriviaGame player1 = new PlayerTriviaGame();
		PlayerTriviaGame player2 = new PlayerTriviaGame();

		JOptionPane.showMessageDialog(null, "YOU HAVE STARTED THE TRIVIA GAME:");
		JOptionPane.showMessageDialog(null, "Player 1 and Player 2 will alternative questions given " +
			                       "for 2 rounds of questions ");
		for (int i = 1; i <= 2; i++)
		{

				JOptionPane.showMessageDialog(null, "Player 1's question");
				player1.createQuestion(i);
				JOptionPane.showMessageDialog(null, "Player 2's question");
				player2.createQuestion(i);

		}

		String inputString;
		int answer;
		TriviaGame question;
		for (int i = 0; i <= 1; i++)
		{
				JOptionPane.showMessageDialog(null, "Player 1's turn");
				question = player2.getQuestion(i);
			    inputString = JOptionPane.showInputDialog(question.getQuestions());
			    answer = Integer.parseInt(inputString);
			    player1.isCorrect(question, answer, i);

				JOptionPane.showMessageDialog(null, "Player 2's turn");
				question = player1.getQuestion(i);
				inputString = JOptionPane.showInputDialog(question.getQuestions());
				 answer = Integer.parseInt(inputString);
				player2.isCorrect(question, answer, i);
		}

		JOptionPane.showMessageDialog(null, "Player 1: " + player1.displayPoints());
		JOptionPane.showMessageDialog(null, "Player 2: " + player2.displayPoints());

		if (player1.getPoints() > player2.getPoints())
			JOptionPane.showMessageDialog(null, "Player 1 won!");
		else if (player1.getPoints() == player2.getPoints())
			JOptionPane.showMessageDialog(null, "It's a tie!!!");
		else 
			JOptionPane.showMessageDialog(null, "Player 2 won!");
		
		System.exit(0);
	}
}