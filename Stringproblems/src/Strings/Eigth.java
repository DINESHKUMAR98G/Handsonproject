package Strings;
import java.util.*;
public class Eigth {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter humpty sentence");
		String s1=sc.nextLine();
		System.out.println("enter dumpty sentence");
		String s2=sc.nextLine();
		if(s1.length()==s2.length()) {
			System.out.println("both are used equal no of words");
		}
		else if(s1.length()<s2.length()) {
			System.out.println("humty used more words");
		}
		else {
			System.out.println("dumpty used more words");
		}
	}

}
