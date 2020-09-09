package Inheritance4;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		double radius;
		double length;
		double breadth;
		double base;
		double height;
		Scanner sc=new Scanner(System.in);
		Shape sa=new Shape();
		Circle c=new Circle();
		Rectangle r=new Rectangle();
		Traingle t=new Traingle();
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the radius");
			radius=sc.nextDouble();
			c.computeArea(radius);
			break;
		case 2:
			System.out.println("enter the len and breadth");
			length=sc.nextDouble();
			breadth=sc.nextDouble();
			r.computeArea(length,breadth);
			break;
		case 3:
			System.out.println("enter the base and height");
			base=sc.nextDouble();
			height=sc.nextDouble();
			r.computeArea(base,height);
			break;
		}
	}

}
