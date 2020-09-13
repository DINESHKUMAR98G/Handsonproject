package interface2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the amount you invest");
		int a=sc.nextInt();
		System.out.println("enter the tenure of sip");
		int b=sc.nextInt();
		AxisBank ab=new AxisBank();
		HdfcBank hd=new HdfcBank();
		ICICI ic=new ICICI();
		System.out.println("enter the bank you want");
		int type=sc.nextInt();
		switch(type) {
		case 1:
			ab.amount(a,b);
			break;
		case 2:
			hd.amount(a, b);
			break;
		case 3:
			ic.amount(a, b);
			break;
		}

	}

}
