package inheritance;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		String accno;
		String accname;
		String bankname;
		String tinNumber;
		String orgname;
		Scanner sc=new Scanner(System.in);
		System.out.println("savings account");
		System.out.println("current account");
		System.out.println("choose account type");
		
		int type=sc.nextInt();
		switch(type) {
		case 1:
			System.out.println("enter account details in comma sepated");
			String details1=sc.nextLine();
			String arr[]=details1.split(",");
			accname=arr[0];
			accno=arr[1];
			bankname=arr[2];
			orgname=arr[3];
			Savingsaccount sa=new Savingsaccount(accname,accno,bankname,orgname);
			sa.display();
			System.out.println("enter the org name:"+orgname);
			break;
		case 2:
			System.out.println("enter the details in comma separted");
			String details2=sc.nextLine();
			String arr1[]=new String[4];
			arr1=details2.split(",", arr1.length);
			accname=arr1[0];
			accno=arr1[1];
			bankname=arr1[2];
			tinNumber=arr1[3];
			Currentaccount ca=new Currentaccount(accname,accno,bankname,tinNumber);
			ca.display();
			System.out.println("entet the tinname:"+tinNumber);
			break;
			
			
		}

	}

}
