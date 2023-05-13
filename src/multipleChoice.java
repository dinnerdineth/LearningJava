import java.util.Scanner;
public class multipleChoice {
	public static void main(String[] args) {
		System.out.println("Welcome, who won the 2022 NRL Premiership?");
		
		String choiceOne = "Dallas Cowboys";
		choiceOne = choiceOne.toUpperCase();
		String choiceTwo = "North Queensland Cowboys";
		choiceTwo = choiceTwo.toUpperCase();
		String choiceThree = "Penrith Panthers";
		choiceThree = choiceThree.toUpperCase();
		String choiceFour = "Carolina Panthers";
		choiceFour = choiceFour.toUpperCase();
		
		String correctAnswer = choiceThree;
		System.out.println(correctAnswer); //Debug printing
		
		System.out.println("Select one of the following options: "+ choiceOne + ", " + choiceTwo + ", " + choiceThree + ", " + choiceFour );
		
		Scanner answer = new Scanner(System.in);
		String userGuess = answer.nextLine();
		userGuess = userGuess.toUpperCase();
		
		if (correctAnswer.equals(userGuess)) {
			System.out.println("That is correct");

		}
		
		else {
			correctAnswer = correctAnswer.toLowerCase();
			System.out.println("That is incorrect. The correct answer is " + correctAnswer);
		}
		
	}

}
