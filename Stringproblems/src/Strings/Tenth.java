package Strings;
import java.util.*;
public class Tenth {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enetr  humpty sentence");
		String s1=sc.nextLine();
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(Character.isUpperCase(c[i])) {
				System.out.println("string is in the uppercase");
			}
			else {
				System.out.println("string is not in the uppercase");
			}
		}
			
		
	}

}
