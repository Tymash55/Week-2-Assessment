//Tyler Machoff
//Week 2 Assessment
public class Geometry {
	
	private double num;
	
	
	public double SquareRoot(double num) {
		num = this.num;
		
		double sqRoot = Math.sqrt(num);
		return sqRoot;
	}
	
	public double squarePerimeter(double sideOne, double sideTwo) {
		
		double side1= sideOne;
		double side2 = sideTwo;
		
		double perimeter = (side1 *2) + (side2 *2);
		return perimeter;
	}
	
	public double area(double num) {
		num = this.num;
		double area = num * num;
		return area;
	}
	
	public int multiply(int a, int b) {
		return a *b;
	}

}
