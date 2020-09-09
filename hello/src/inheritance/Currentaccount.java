package inheritance;

public class Currentaccount extends Account {
	private String tinNumber;

	


	public Currentaccount(String accname,String accno,String bankname,String tinNumber) {
		super(accname,accno,bankname);
		this.tinNumber = tinNumber;
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	

}
