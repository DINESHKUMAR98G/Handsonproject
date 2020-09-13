package interface1;

public class Rectangle implements Polygon{
	double length;
	double breadth;
	
	public double calciPeri(double x,double y) {
		double periofrec=2*(x+y);
		System.out.println("PERIMETER of rec:"+periofrec);
		return 0;
	}
	
	public double calcArea(double x,double y) {
		// TODO Auto-generated method stub
		double areaofrec=x*y;
		System.out.println("area of rectangle:"+areaofrec);
		return 0;
	}

	@Override
	public double calcPeri(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
