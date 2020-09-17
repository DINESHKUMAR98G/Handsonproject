package Strings;
import java.util.*;
public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter humpty sentence");
		String s1=sc.nextLine();
		System.out.println("enter dumpty sentence");
		String s2=sc.nextLine();
		if(s1.contains(s2)) {
			System.out.println("found");
		}
		else {
			System.out.println("not found");
		}
		
	}

}
