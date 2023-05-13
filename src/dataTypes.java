import java.util.Scanner;
public class dataTypes {
	public static void main(String[] args) {
		String studentFirstName = "Dallas";
		String studentLastName = "Simpson";
		double GPA = 3.5;
		int age = 24;
		
		char firstInitial = studentFirstName.charAt(0);
		System.out.println(firstInitial);
		System.out.println(studentFirstName + " " + studentLastName + " GPA and age " + GPA + " " + age);
		//Input
		System.out.println("What do you want to update the GPA to?");
		Scanner input = new Scanner(System.in);
		GPA = input.nextDouble();
		
		System.out.println(studentFirstName + " " + studentLastName + " GPA and age " + GPA + " " + age);
		
	}
}
