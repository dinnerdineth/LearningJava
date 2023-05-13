public class functionParameters {
	
	public static double calculateTotal(double mealPrice, double tipRate, double taxRate) {
		double tip = tipRate * mealPrice;
		double tax = taxRate * mealPrice;
		double total = mealPrice + tip + tax;
		System.out.println("Total is $" + total);
		return total;
	}
	
	public static void main(String[] args) {
		double groupTotal = calculateTotal(302,0.25,0.1);
		System.out.println("Group total is $" + groupTotal);
		
		double splitPrice = groupTotal/5;
		
		System.out.println("Split price is $" + String.format("%.2f", splitPrice));
		
	}

}
