
public class Triangle {
	double base;
	double height;
	double sideOne;
	double sideTwo;
	double sideThree;
	
	public Triangle(double base,double height, double sideOne, double sideTwo, double sideThree) {
		this.base = base;
		this.height = height;
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}
	
	public double findArea() {
		double area = (this.base * this.height)/2;
		return area;
	}
	
	
}
