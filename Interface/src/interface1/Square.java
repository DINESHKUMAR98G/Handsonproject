package interface1;

public   class Square implements Polygon {
	double side;
	//double a;
	//double a;

	public double calciPeri(double x) {
		// TODO Auto-generated method stub
		 double peri=4*x;
		 System.out.println("perimeter of square:"+peri);
		 return 0;
		 
	}

	public double calcArea(double x) {
		// TODO Auto-generated method stub
		double area=x*x;
		System.out.println("area of square:"+area);
		return 0;
	}

	@Override
	public double calcPeri(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcArea(double x, double y) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

	

	

}
