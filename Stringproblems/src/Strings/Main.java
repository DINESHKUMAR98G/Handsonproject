package Strings;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		String type;
		Integer cost;
		Integer availablequantity;
		ArrayList<Item>it=new ArrayList<Item>();
		System.out.println("enter the no of times");
		int no=sc.nextInt();
		System.out.println("enter the details in the correct format");
		for(int i=0;i<no;i++) {
			String s=sc.next();
			String arr[]=s.split("\\$");
			name=arr[0];
			type=arr[1];
			cost=Integer.parseInt(arr[2]);
			availablequantity=Integer.parseInt(arr[3]);
			Item it1=new Item(name,type,cost,availablequantity);
			it.add(it1);
		}
		System.out.println("Items details:");
		for(Item it1:it) {
			if(it1.getAvailablequantity()==0) {
				System.out.println(it1.getName()+","+it1.getType()+","+it1.getCost()+","+"not available");
				
			}
			else {
				System.out.println(it1.getName()+","+it1.getType()+","+it1.getCost()+","+" available");

				
			}
		}
		
	}

}
