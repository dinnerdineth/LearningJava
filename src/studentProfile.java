/*
 * Represent a college student with a Java class
 * First Name, Last Name, GPA, Expected Graduation, Major
 * 1 behaviour to increment the expected graduation  
 */
public class studentProfile {
	String firstName;
	String lastName;
	double GPA;
	String major;
	int gradYear;
	
	public studentProfile(String firstName, String lastName, double GPA, String major, int gradYear) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.GPA = GPA;
		this.major = major;
		this.gradYear = gradYear;
		
	}
	public int gradYear() {
		gradYear = gradYear + 1;
		return gradYear;
	}

}
