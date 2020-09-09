package inheritance;

public class Account {
	protected String accname;
	protected String accno;
	protected String bankname;
	
	public Account(String accname, String accno, String bankname) {
		super();
		this.accname = accname;
		this.accno = accno;
		this.bankname = bankname;
	}
	protected void display() {
		System.out.println("Account Name:"+getAccname());
		System.out.println("Account number:"+getAccno());
		System.out.println("Bank name:"+getBankname());
		
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccname() {
		return accname;
	}
	public String getAccno() {
		return accno;
	}
	
	public String getBankname() {
		return bankname;
	}
	
	

}
