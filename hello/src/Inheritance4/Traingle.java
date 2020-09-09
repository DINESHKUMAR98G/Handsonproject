package Inheritance4;

public class Traingle extends Shape {
	double base;
	double height;
	public void computeArea(double base,double height) {
		double areaofthetraingle=(base*height)/2;
		System.out.println("area of the traingle:"+areaofthetraingle);
	}
	

}
