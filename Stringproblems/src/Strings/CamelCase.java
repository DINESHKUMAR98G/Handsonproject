package Strings;
import java.util.*;
public class CamelCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the event name");
		String s1=sc.nextLine();
		StringBuilder sb=new StringBuilder();
		for(String s2:s1.toLowerCase().split(" ")) {
			sb.append(s2.substring(0, 1).toUpperCase());
			sb.append(s2.substring(1));
		}
		System.out.println(sb);
		
	}

}
