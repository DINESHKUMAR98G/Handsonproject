package interface2;

public class ICICI implements MutualFund{
	public void amount(int x,int y) {
		int amount=(int)(x*y*0.60);
		System.out.println("you returned amount as:"+amount+" in"+y);
	}

	@Override
	public void duration() {
		// TODO Auto-generated method stub
		
	}

}
