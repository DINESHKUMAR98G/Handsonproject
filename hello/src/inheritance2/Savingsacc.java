package inheritance2;

public class Savingsacc extends Accont{
	protected double minimumbalance;
	
	public Savingsacc(String accnumber,double balance,String accholdername,double minimumbalance) {
		super(accnumber,balance,accholdername);
		this.minimumbalance=minimumbalance;
	}
	public double getMinimumbalance() {
		return minimumbalance;
	}
	public void setMinimumbalance(double minimumbalance) {
		this.minimumbalance = minimumbalance;
	}
	
		
}
