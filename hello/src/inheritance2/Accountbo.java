package inheritance2;
import java.util.*;
public class Accountbo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String accnumber="";
		double balance=0;
		String accholdername="";
		double minimumbalance=0;
		int lockingperiod=0;
		System.out.println("enter the details in separted");
		String s=sc.next();
		String arr[]=s.split(",");
		accnumber=arr[0];
		balance=Double.parseDouble(arr[1]);
		accholdername=arr[2];
		minimumbalance=Double.parseDouble(arr[3]);
		lockingperiod=Integer.parseInt(arr[4]);
		Fixedaccount fa=new Fixedaccount(accnumber,balance,accholdername,minimumbalance,lockingperiod);
		fa.getaccountdetail();
		
	}

	
	}

