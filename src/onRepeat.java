import java.util.Scanner;
public class onRepeat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isonRepeat = true;
		
		while(isonRepeat) {
			System.out.println("Repeat is active");
			System.out.println("Would you like to cancel repeat? (Yes/No)");
			
			String userInput = input.next();
			userInput = userInput.toUpperCase();
			System.out.println(userInput);
			
			if(userInput.equals("YES")) {
				isonRepeat = false;
				
			}
			
			else if (userInput.equals("NO")) {
				isonRepeat = true;
			}
			
			else {
				System.out.println("Invalid selection. Restart process and enter Yes or No");
				//Blank Line
				System.out.println();
			}
		}
		
	}

}
