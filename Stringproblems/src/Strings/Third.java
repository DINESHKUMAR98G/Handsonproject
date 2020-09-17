package Strings;
import java.util.*;
public class Third {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter humpty sentence");
		String s1=sc.nextLine();
		StringBuffer sb=new StringBuffer(s1);
		sb.reverse();
		System.out.println("dumpty sentence  "+sb);
	}

}
