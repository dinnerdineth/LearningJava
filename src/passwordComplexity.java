import java.util.Scanner;
public class passwordComplexity {
	public static boolean complexityChecker(String password) {
		if (password.length() >= 6) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String input = scanner.nextLine();
		System.out.println("Is the password complex enough? " + complexityChecker(input));
		
		scanner.close();
	}
}
