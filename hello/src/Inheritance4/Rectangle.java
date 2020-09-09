package Inheritance4;

public class Rectangle extends Shape{
	double length;
	double breadth;
	public void computeArea(Double length,Double breadth) {
		double areaoftherectangle=length*breadth;
		System.out.println("area of the rectangle"+areaoftherectangle);
	}

}
