package Inheritance4;

public class Circle extends Shape {
	 double radius;
	void computeArea(Double radius) {
		double areaofthecircle=(22/7) * (radius * radius);
		System.out.println("area of circle:"+areaofthecircle);
	}

}
