package Strings;
import java.util.*;
public class Sixth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("dumpty sentence");
		String s1=sc.nextLine();
		System.out.println("remove word");
		String s2=sc.nextLine();
		s1=s1.replaceAll(s2,"");
		System.out.println("result   "+s1);
	}

}
