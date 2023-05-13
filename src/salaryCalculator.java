
public class salaryCalculator {
	public static double salaryCalculatorFunction(double rate,double hours,double vacationHours){
		if (rate < 0) {
			return -1;
		}
		
		if (hours < 0) {
			return -1;
		}
		
		double pay = rate * hours * 52;
		double vacationDeduction = rate * vacationHours;
		double salary = pay - vacationDeduction;
		return salary;
	}
	
	public static void main(String[] args) {
		double salary2022 =salaryCalculatorFunction(-5,37.5,21);
		System.out.println("Your salary is $" + String.format("%.2f", salary2022));
	}

}
