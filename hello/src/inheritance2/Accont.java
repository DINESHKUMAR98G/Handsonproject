package inheritance2;

public class Accont {
	protected String accnumber;
	protected double balance;
	protected String accholdername;
	public Accont(String accnumber, double balance, String accholdername) {
		super();
		this.accnumber = accnumber;
		this.balance = balance;
		this.accholdername = accholdername;
	}
	public String getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(String accnumber) {
		this.accnumber = accnumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccholdername() {
		return accholdername;
	}
	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}

}
