package inheritance;

public class Savingsaccount extends Account {
	private String orgname;

	

	public Savingsaccount(String accname,String accno,String bankname,String orgname) {
		super(accname,accno,bankname);
		this.orgname = orgname;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

}
