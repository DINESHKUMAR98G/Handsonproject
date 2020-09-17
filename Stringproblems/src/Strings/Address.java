package Strings;

public class Address {
	private Integer userid;
	private String street;
	private String city;
	private String state;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getcity() {
		return city;
	}
	public void setCcity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Address() {
		super();
	}
	public Address(Integer userid, String street, String city, String state) {
		super();
		this.userid = userid;
		this.street = street;
		this.city = city;
		this.state = state;
	};
	

}
