package inheritance3;

public class Stall {
	protected String name;
	protected String detail;
	protected String ownername;
	int squarefeet;
	int noOftv;
	int cost;
	public Stall() {
		super();
	}
	public Stall(String name, String detail, String ownername) {
		super();
		this.name = name;
		this.detail = detail;
		this.ownername = ownername;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public  void computecost(int choice,int squarefeet) {
		if(choice==1) {
			cost=200*squarefeet;
		}
		else if(choice==2) {
			cost=150*squarefeet;
		}
		else {
			cost=100*squarefeet;
		}
		System.out.println("stall cost"+cost);
		
	}
	public  void computecost(int choice,int squarefeet,int noOftv) {
		if(choice==1) {
			cost=200*squarefeet*noOftv;
		}
		else if(choice==2) {
			cost=150*squarefeet*noOftv;
		}
		else {
			cost=100*squarefeet*noOftv;
		}
		System.out.println("stall cost"+cost);
		
	}
	

}
