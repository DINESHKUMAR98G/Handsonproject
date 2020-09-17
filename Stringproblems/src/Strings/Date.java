package Strings;
import java.util.*;
public class Date {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter date value");
		String date=sc.nextLine();
		String sub1=date.substring(0,2);
		String sub2=date.substring(3, 5);
		String sub3=date.substring(6);
		String corrected=sub1+"-"+sub2+"-"+sub3;
		System.out.println("Date in correct format:"+corrected);
		
	}

}
