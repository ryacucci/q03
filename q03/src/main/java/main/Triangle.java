package main;
//triangle is subclass of geometric object
public class Triangle extends GeometricObject {
//creating varibles and getters
	double side1;
	public double getSide1() {
		return side1;
	}

	private void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	private void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	private void setSide3(double side3) {
		this.side3 = side3;
	}
	double side2;
	double side3;

	public Triangle() {
		side1 = 1;
		side2 = 2;
		side3 = 3;

	}

	double getArea()
	{
		double a= (side1*side2)/2;
		

	return a;
}
	//returning perimeter
	double getPerimeter()
	{
		double p= side1+side2+side3;
		

	return p;
}
	// strings stating area and perimeter
	 public String toString()
	{
		
		System.out.println("The Perimeter is " + getPerimeter() );
		System.out.println("The Area is " + getArea() );
		return null;
	}
}
