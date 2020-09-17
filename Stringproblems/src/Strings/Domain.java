package Strings;
import java.util.*;
public class Domain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter email.address");
		String mail=sc.nextLine();
		String sub=mail.substring(mail.indexOf(".")+1);
		if(sub.contentEquals("com")) {
			System.out.println("valid email address");
		}
		else if(sub.contentEquals("in")) {
			System.out.println("valid email address");
		}
		else if(sub.contains("net")) {
			System.out.println("valid  email address");
		}
		else if(sub.contentEquals("org")) {
			System.out.println("valid email address");
		}
		else {
			System.out.println("invalid email address");
		}
	}

}
