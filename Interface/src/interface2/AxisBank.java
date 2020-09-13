package interface2;

public class AxisBank implements MutualFund{

	@Override
	public void duration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void amount(int x,int y) {
		int amount=(int)(x*y*0.56);
		System.out.println("you retunred as:"+amount+" in"+" "+y);
	}
	

}
