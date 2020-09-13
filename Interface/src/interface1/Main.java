package interface1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Polygon py1=new Square();
	Polygon py2=new Rectangle();
	System.out.println("enter the length and breadth");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	System.out.println("enter side value");
	double c=sc.nextDouble();
	py1.calcPeri(a,b);
	py1.calcArea(a,b);
	py2.calcPeri(c,0);
	py2.calcArea(c,0);
	}

}
