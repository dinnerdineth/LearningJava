import java.util.Scanner;
public class learnFunctions {
	public static void announceDevelopterTTime() {
		System.out.println("Waiting to start tea time");
		System.out.println("Enter a word and press Enter to start tea time");
		Scanner input = new Scanner(System.in);
		input.next();
		System.out.println("It's tea time");
		
		
	}
	public static void main(String[] args) {
		announceDevelopterTTime();
	}

}
