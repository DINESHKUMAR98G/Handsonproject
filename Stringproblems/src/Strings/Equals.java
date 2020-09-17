package Strings;
import java.util.*;
public class Equals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter address 1:");
		String s1=sc.nextLine();
		System.out.println("enter address 2:");
		String s2=sc.nextLine();
		if(s1.equals(s2)) {
			System.out.println("RED");
		}
		else if(s1.equalsIgnoreCase(s2)) {
			System.out.println("BLUE");
		}
		else {
			System.out.println("GREEEN");
		}
	}

}
