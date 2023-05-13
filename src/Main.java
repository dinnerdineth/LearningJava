
public class Main {
	public static void main(String[] args) {
		
		studentProfile johnSmith = new studentProfile("John","Smith",3.5,"Engineering",2023);
		studentProfile alexSmith = new studentProfile("Alex", "Smith",4.0,"Science",2022);
		
		int newGradYear_Alex = alexSmith.gradYear();
		System.out.println("New grad year for " + alexSmith.firstName +" "+alexSmith.lastName + " is " + newGradYear_Alex);
	}

}
