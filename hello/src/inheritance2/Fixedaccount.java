package inheritance2;

public class Fixedaccount extends Savingsacc{
	private int lockingperiod;
	
	public Fixedaccount(String accnumber,double balance,String accholdername,double minimumbalance,int lockingperiod) {
		super(accnumber,balance,accholdername,minimumbalance);
		this.lockingperiod = lockingperiod;
	}
	public int getLockingperiod() {
		return lockingperiod;
	}
	public void setLockingperiod(int lockingperiod) {
		this.lockingperiod = lockingperiod;
	}
	public void getaccountdetail() {
		
		System.out.format("%-20s %-10s %-20s %-20s %s\n","Account Number","Balance","Account holder name","Minimum balance","Locking period");
		
		System.out.format("%-20s %-10s %-20s %-20s %s\n",getAccnumber(),getBalance(),getAccholdername(),getMinimumbalance(),getLockingperiod());

	}
	
}
