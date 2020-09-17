package Strings;

public class Item {
	private String name;
	private String type;
	private Integer cost;
	private Integer availablequantity;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getAvailablequantity() {
		return availablequantity;
	}
	public void setAvailablequantity(int availablequantity) {
		this.availablequantity = availablequantity;
	}
	public Item() {
		super();
	}
	public Item(String name, String type, int cost, int availablequantity) {
		super();
		this.name = name;
		this.type = type;
		this.cost = cost;
		this.availablequantity = availablequantity;
	}
	
}
