package Strings;
import java.util.*;
public class Main1 {

	public static void main(String[] args)throws NumberFormatException {
		ArrayList<Address>al=new ArrayList<Address>();
		Integer userid=0;
		String street="";
		String city="";
		String state="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of users");
		int users=sc.nextInt();
		System.out.println("enter user address details in csv format");
		for(int i=0;i<users;i++) {
		String s=sc.nextLine();
		String arr1[]=new String[4];
		arr1=s.split(",");
		userid=Integer.parseInt(arr1[0]);
		street=arr1[1];
		city=arr1[2];
		state=arr1[3];
		Address ad=new Address(userid,street,city,state);
		al.add(ad);

		}
		for(Address ad:al) {
			System.out.format("%-15s%-15s%-15s%s\n",ad.getUserid(),ad.getStreet(),ad.getcity(),ad.getState());
		}
	}

}
