import java.util.Scanner;
import java.util.Random;

public class doubleOrNothing {
	private static int startPoints = 10;
	private Scanner scanner = new Scanner(System.in);
	private Random random = new Random(); 
	private int current = startPoints;
	private boolean isPlaying = true;
	
	private void printWelcome() {
		String welcome = "Welcome to double or nothing";
		System.out.println(welcome);
	}
	
	private boolean askUserToContinue() {
		System.out.println("Do you want to keep playing? (Y/N)");
		String keepPlaying = scanner.next();
		if (keepPlaying.toUpperCase() == "Y") {
			isPlaying = true;
		}
		
		else {
			isPlaying = false;
		}
		
		return isPlaying;
		
	}
	
	
	private void printTryToDouble() {
		String doubling = "Attempting to double up!";
		System.out.println(doubling);
	}
	
	
	private boolean shouldDouble() {
		int generatedNum = random.nextInt(100);
		
		if (generatedNum < 60) {
			return false;
		}
		
		else {
			return true;
		}
	}
	
	private int doubleCurrent() {
		int newPoints = current * 2;
		System.out.println("Your new points total is " + newPoints);
		return newPoints;
	}
	
	private void printLost() {
		System.out.println("You lost unlucky");
	}
	
	public void playGame() {
		printWelcome();
		askUserToContinue();
		
		while (this.isPlaying) {
			printTryToDouble();
			
			if (shouldDouble()) {
				doubleCurrent();
				askUserToContinue();
				
			}
			
			else {
				printLost();
				return;
			}
			
		}
		
	}
	
		
}
