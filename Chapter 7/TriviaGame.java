import javax.swing.JOptionPane;

//Jeffrey Wang 
//11.16.18

/** 7.17 Trivia Game: Create a simple trivia game for two players. The program will work like this:
- Starting with player 1, each player gets a turn at answering 5 trivia questions. 
(There are 10 questions, 5 for each player.) When a question is displayed, four possible
ansers are also displayed. Only one of the answers is correct, and if the player selects the correct answer, he or she earns a point. 

- After answers have been selected for all the questions, the program displays the number of points earaned by each player and declares the player with the highest number of points the winner.

- You are to design a Question class to hold the date for a trivia question. The Question class should have String fields for the following data. 
- A trivia question
- Possible answer 1
- Possible answer 2
- Possible answer 3
- Possible answer 4
- The number of the correct answer (1,2,3,4)

It should have appropriate constructor(s), accessor, and mutator methods. 

The program should create an array of 10 Question objects, one for each trivia question. (If you prefer, youo can use an ArrayList instead of an array).
*/

public class TriviaGame
{
	private String question;
	private String answer1, answer2, answer3, answer4;
	private int questionNumber;
	private int correct = -1;

	public TriviaGame(int num)
	{
		questionNumber = num;
		question = askQuestion();
		answer1 = askChoice(1);
		answer2 = askChoice(2);
		answer3 = askChoice(3);
		answer4 = askChoice(4);
	}

	private String askQuestion()
	{
		return JOptionPane.showInputDialog("What is your question " + questionNumber + "?");
	}

	private String askChoice(int select)
	{
		String answer = JOptionPane.showInputDialog("What is the possible solution for answer " + 
						select + "?");
		if (correct == -1 && JOptionPane.showInputDialog("Is this the correct answer?<yes/no> ").equals("yes"))
				correct = select;
		return answer;
	}

	public String getQuestions()
	{
		return Integer.toString(questionNumber) + ": " + question + "\n answers: " +
		 "1:" + answer1 + "  2: " + answer2 + "  3:" + answer3 + "  4: " + answer4;
	}

	public int getQuestionNumber()
	{
		return questionNumber;
	}

	public String getAnswers(int select)
	{
		switch (select)
		{
			case 1:
				return answer1;
			case 2:
				return answer2;
			case 3:
				return answer3;
			case 4:
				return answer4;
			default: 
				return "Invalid Answer";
		}
	}

	public void setCorrectAnswer(int select)
	{
		if (select <= 4 && select >=1)
			correct = select;
		else 
			System.out.println("Wrong answer selection");
	}

	public int getCorrectAnswer()
	{
		return correct;
	}
}