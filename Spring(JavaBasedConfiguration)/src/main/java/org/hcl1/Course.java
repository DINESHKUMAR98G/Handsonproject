package org.hcl1;

public class Course {
	String name;
	String mentor;
	Double fee;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMentor() {
		return mentor;
	}
	public void setMentor(String mentor) {
		this.mentor = mentor;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public void display() {
		System.out.println("course:"+name);
		System.out.println("SME by:"+mentor);
		System.out.println("Fee:"+fee);
	}

}
