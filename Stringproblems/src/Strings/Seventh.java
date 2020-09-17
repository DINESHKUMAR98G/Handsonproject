package Strings;
import java.util.*;
public class Seventh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter humpty sentence");
		String s1=sc.nextLine();
		System.out.println("what dumpty want to insert& where");
		String s2=sc.nextLine();
		System.out.println("enter the position");
		int pos=sc.nextInt();
		System.out.println(s1.indexOf(s2, pos));
	}

}
