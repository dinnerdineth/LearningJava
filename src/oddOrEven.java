import java.util.Scanner;

public class oddOrEven {
	public static boolean isEven(int number) {
		int modulus = number%2;
		
		if (modulus == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		int userInput = scanner.nextInt();
		System.out.println("Is the number " + userInput + " even? " + isEven(userInput));
		scanner.close();
	}

}
